package students.alex_kalashnikov.lesson_11.level_2.task_13;

import java.util.Arrays;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest victim = new BookDatabaseImplTest();
        victim.testDeleteByAuthor1();
        victim.testDeleteByAuthor2();
        victim.testDeleteByAuthor3();
        victim.testDeleteByAuthor4();
        victim.testDeleteByAuthor5();
        victim.testDeleteByAuthor6();
        victim.testDeleteByAuthor7();
        victim.testDeleteByAuthor8();

    }

    void testArr(Book[] expectedResult, Book[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testDeleteByAuthor1() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.deleteByAuthor("A1");
        Book[] expectedResult = {new Book("A2", "B2"), new Book("A3", "B3"),
                new Book("A4", "B4"), new Book("A5", "B5")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByAuthor2() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.deleteByAuthor("A5");
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A2", "B2"),
                new Book("A3", "B3"), new Book("A4", "B4")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByAuthor3() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A1", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A1", "B5"));
        newDataBase.deleteByAuthor("A1");
        Book[] expectedResult = {new Book("A2", "B2"), new Book("A4", "B4")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByAuthor4() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.deleteByAuthor("A11");
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A2", "B2"),
                new Book("A3", "B3"), new Book("A4", "B4"),
                new Book("A5", "B5")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByAuthor5() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.deleteByAuthor("A11");
        newDataBase.save(new Book("A11", "B6"));
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A2", "B2"),
                new Book("A3", "B3"), new Book("A4", "B4"),
                new Book("A5", "B5"), new Book("A11", "B6")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByAuthor6() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.deleteByAuthor("A3");
        newDataBase.save(new Book("A3", "B6"));
        Book[] expectedResult = {new Book("A1", "B1"), new Book("A2", "B2"),
                new Book("A4", "B4"), new Book("A5", "B5"),
                new Book("A3", "B6")};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByAuthor7() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A3", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A3", "B5"));
        newDataBase.deleteByAuthor("A3");
        newDataBase.deleteByAuthor("A2");
        newDataBase.deleteByAuthor("A4");
        Book[] expectedResult = {};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

    void testDeleteByAuthor8() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A1", "B2"));
        newDataBase.save(new Book("A1", "B3"));
        newDataBase.save(new Book("A1", "B4"));
        newDataBase.save(new Book("A1", "B5"));
        newDataBase.deleteByAuthor("A1");
        Book[] expectedResult = {};
        testArr(expectedResult, newDataBase.repository.toArray(Book[]::new));
    }

}