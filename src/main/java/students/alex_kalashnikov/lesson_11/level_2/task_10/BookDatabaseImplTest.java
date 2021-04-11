package students.alex_kalashnikov.lesson_11.level_2.task_10;

import java.util.Arrays;
import java.util.List;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest victim = new BookDatabaseImplTest();
        victim.testFindByAuthor1();
        victim.testFindByAuthor2();
        victim.testFindByAuthor3();
        victim.testFindByAuthor4();
        victim.testFindByAuthor5();
        victim.testFindByAuthor6();
        victim.testFindByAuthor7();

    }

    void testArr(Book[] expectedResult, Book[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindByAuthor1() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        Book[] expectedResult = {new Book("A1", "B1")};
        testArr(expectedResult, newDataBase.findByAuthor("A1").toArray(Book[]::new));
    }

    void testFindByAuthor2() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        Book[] expectedResult = {new Book("A5", "B5")};
        testArr(expectedResult, newDataBase.findByAuthor("A5").toArray(Book[]::new));
    }

    void testFindByAuthor3() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        Book[] expectedResult = {new Book("A3", "B3")};
        testArr(expectedResult, newDataBase.findByAuthor("A3").toArray(Book[]::new));
    }

    void testFindByAuthor4() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A1", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A1", "B5"));
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A1", "B3"), new Book("A1", "B5")};
        testArr(expectedResult, newDataBase.findByAuthor("A1").toArray(Book[]::new));
    }

    void testFindByAuthor5() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A1", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A1", "B5"));
        Book[] expectedResult = {};
        testArr(expectedResult, newDataBase.findByAuthor("A11").toArray(Book[]::new));
    }

    void testFindByAuthor6() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A1", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A1", "B5"));
        newDataBase.delete(new Book("A1", "B3"));
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A1", "B5")};
        testArr(expectedResult, newDataBase.findByAuthor("A1").toArray(Book[]::new));
    }

    void testFindByAuthor7() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.delete(new Book("A1", "B1"));
        Book[] expectedResult = {};
        testArr(expectedResult, newDataBase.findByAuthor("A1").toArray(Book[]::new));
    }

}