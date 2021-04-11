package students.alex_kalashnikov.lesson_11.level_2.task_11;

import java.util.Arrays;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest victim = new BookDatabaseImplTest();
        victim.testFindByTitle1();
        victim.testFindByTitle2();
        victim.testFindByTitle3();
        victim.testFindByTitle4();
        victim.testFindByTitle5();
        victim.testFindByTitle6();
        victim.testFindByTitle7();

    }

    void testArr(Book[] expectedResult, Book[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindByTitle1() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        Book[] expectedResult = {new Book("A1", "B1")};
        testArr(expectedResult, newDataBase.findByTitle("B1").toArray(Book[]::new));
    }

    void testFindByTitle2() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        Book[] expectedResult = {new Book("A5", "B5")};
        testArr(expectedResult, newDataBase.findByTitle("B5").toArray(Book[]::new));
    }

    void testFindByTitle3() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        Book[] expectedResult = {new Book("A3", "B3")};
        testArr(expectedResult, newDataBase.findByTitle("B3").toArray(Book[]::new));
    }

    void testFindByTitle4() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B1"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B1"));
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A3", "B1"), new Book("A5", "B1")};
        testArr(expectedResult, newDataBase.findByTitle("B1").toArray(Book[]::new));
    }

    void testFindByTitle5() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A1", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A1", "B5"));
        Book[] expectedResult = {};
        testArr(expectedResult, newDataBase.findByTitle("B11").toArray(Book[]::new));
    }

    void testFindByTitle6() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B1"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B1"));
        newDataBase.delete(new Book("A3", "B1"));
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A5", "B1")};
        testArr(expectedResult, newDataBase.findByTitle("B1").toArray(Book[]::new));
    }

    void testFindByTitle7() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.delete(new Book("A1", "B1"));
        Book[] expectedResult = {};
        testArr(expectedResult, newDataBase.findByTitle("B1").toArray(Book[]::new));
    }

}