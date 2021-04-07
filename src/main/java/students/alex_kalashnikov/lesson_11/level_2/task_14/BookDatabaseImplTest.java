package students.alex_kalashnikov.lesson_11.level_2.task_14;

import java.util.Arrays;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest victim = new BookDatabaseImplTest();
        victim.testDeleteByTitle1();
        victim.testDeleteByTitle2();
        victim.testDeleteByTitle3();
        victim.testDeleteByTitle4();
        victim.testDeleteByTitle5();
        victim.testDeleteByTitle6();
        victim.testDeleteByTitle7();

    }

    void testArr(Book[] expectedResult, Book[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testDeleteByTitle1() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.deleteByTitle("B1");
        Book[] expectedResult = {new Book("A2", "B2"), new Book("A3", "B3"),
                new Book("A4", "B4"), new Book("A5", "B5")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByTitle2() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.deleteByTitle("B5");
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A2", "B2"),
                new Book("A3", "B3"), new Book("A4", "B4")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByTitle3() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B1"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B1"));
        newDataBase.deleteByTitle("B1");
        Book[] expectedResult = {new Book("A2", "B2"), new Book("A4", "B4")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByTitle4() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.deleteByTitle("B11");
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A2", "B2"),
                new Book("A3", "B3"), new Book("A4", "B4"),
                new Book("A5", "B5")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByTitle5() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.deleteByTitle("B11");
        newDataBase.save(new Book("B11", "B6"));
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A2", "B2"),
                new Book("A3", "B3"), new Book("A4", "B4"),
                new Book("A5", "B5"), new Book("B11", "B6")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByTitle6() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.deleteByTitle("B3");
        newDataBase.save(new Book("A6", "B3"));
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A2", "B2"),
                new Book("A4", "B4"), new Book("A5", "B5"),
                new Book("A6", "B3")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByTitle7() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B1"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B1"));
        newDataBase.deleteByTitle("B1");
        newDataBase.deleteByTitle("B2");
        newDataBase.deleteByTitle("B4");
        Book[] expectedResult = {};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

}