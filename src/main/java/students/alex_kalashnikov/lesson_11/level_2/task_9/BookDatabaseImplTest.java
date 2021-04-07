package students.alex_kalashnikov.lesson_11.level_2.task_9;

import java.util.Arrays;
import java.util.List;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest victim = new BookDatabaseImplTest();
        victim.testFindById1();
        victim.testFindById2();
        victim.testFindById3();
        victim.testFindById4();
        victim.testFindById5();

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

    void testArr(Book[] expectedResult, Book[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindById1() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.repository = create();
        Book[] expectedResult = {new Book("A1", "B1")};
        testArr(expectedResult, newDataBase.findById(1L).stream().toArray(Book[]::new));
    }

    void testFindById2() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.repository = create();
        Book[] expectedResult = {new Book("A5", "B5")};
        testArr(expectedResult, newDataBase.findById(5L).stream().toArray(Book[]::new));
    }

    void testFindById3() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.repository = create();
        Book[] expectedResult = {};
        testArr(expectedResult, newDataBase.findById(11L).stream().toArray(Book[]::new));
    }

    void testFindById4() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.repository = create();
        Book[] expectedResult = {};
        newDataBase.delete(new Book("A3", "B3"));
        testArr(expectedResult, newDataBase.findById(3L).stream().toArray(Book[]::new));
    }

    void testFindById5() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        Book[] expectedResult = {new Book("A3", "B3")};
        newDataBase.delete(new Book("A3", "B3"));
        newDataBase.save(new Book("A3", "B3"));
        testArr(expectedResult, newDataBase.findById(6L).stream().toArray(Book[]::new));
    }

}