package students.alex_kalashnikov.lesson_11.level_2.task_8;

import java.util.Arrays;
import java.util.List;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest victim = new BookDatabaseImplTest();
        victim.testDelete1();
        victim.testDelete2();
        victim.testDelete3();
        victim.testDelete4();
        victim.testArrAfterDelete1();
        victim.testArrAfterDelete2();
        victim.testArrAfterDelete3();
        victim.testDeleteSameBooks();

    }

    List<Book> create() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        return newDataBase.repository;
    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testArr(Book[] expectedResult, Book[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testDelete1() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.repository = create();
        test(true, newDataBase.delete(new Book("A1", "B1")));
    }

    void testDelete2() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.repository = create();
        test(true, newDataBase.delete(new Book("A5", "B5")));
    }

    void testDelete3() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.repository = create();
        test(true, newDataBase.delete(new Book("A3", "B3")));
    }

    void testDelete4() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.repository = create();
        test(false, newDataBase.delete(new Book("A11", "B11")));
    }

    void testArrAfterDelete1() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.repository = create();
        Book[] expectedResult = {new Book("A2", "B2"), new Book("A4", "B4")};
        newDataBase.delete(new Book("A1", "B1"));
        newDataBase.delete(new Book("A3", "B3"));
        newDataBase.delete(new Book("A5", "B5"));
        newDataBase.delete(new Book("A11", "B11"));
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testArrAfterDelete2() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.repository = create();
        Book[] expectedResult = {};
        newDataBase.delete(new Book("A1", "B1"));
        newDataBase.delete(new Book("A2", "B2"));
        newDataBase.delete(new Book("A3", "B3"));
        newDataBase.delete(new Book("A4", "B4"));
        newDataBase.delete(new Book("A5", "B5"));
        newDataBase.delete(new Book("A11", "B11"));
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testArrAfterDelete3() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.repository = create();
        Book[] expectedResult = {new Book("A3", "B3")};
        newDataBase.delete(new Book("A1", "B1"));
        newDataBase.delete(new Book("A2", "B2"));
        newDataBase.delete(new Book("A3", "B3"));
        newDataBase.delete(new Book("A4", "B4"));
        newDataBase.delete(new Book("A5", "B5"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.delete(new Book("A11", "B11"));
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteSameBooks() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A1", "B1"));
        Book[] expectedResult = {new Book("A2", "B2"), new Book("A4", "B4"),};
        newDataBase.delete(new Book("A1", "B1"));
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

}