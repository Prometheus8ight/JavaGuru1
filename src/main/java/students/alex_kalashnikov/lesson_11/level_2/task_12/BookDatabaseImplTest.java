package students.alex_kalashnikov.lesson_11.level_2.task_12;

import java.util.Arrays;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest victim = new BookDatabaseImplTest();
        victim.testCountAllBooks1();
        victim.testCountAllBooks2();
        victim.testCountAllBooks3();
        victim.testCountAllBooks4();
        victim.testCountAllBooks5();
        victim.testCountAllBooks6();
//        victim.testCountAllBooks7();

    }

    void test(int expectedResult, int realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testCountAllBooks1() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        test(5, newDataBase.countAllBooks());
    }

    void testCountAllBooks2() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        test(0, newDataBase.countAllBooks());
    }

    void testCountAllBooks3() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.delete(new Book("A1", "B1"));
        newDataBase.delete(new Book("A3", "B3"));
        test(3, newDataBase.countAllBooks());
    }

    void testCountAllBooks4() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.delete(new Book("A1", "B1"));
        newDataBase.delete(new Book("A2", "B2"));
        newDataBase.delete(new Book("A3", "B3"));
        newDataBase.delete(new Book("A4", "B4"));
        newDataBase.delete(new Book("A5", "B5"));
        test(0, newDataBase.countAllBooks());
    }

    void testCountAllBooks5() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.delete(new Book("A11", "B11"));
        newDataBase.delete(new Book("A3", "B3"));
        test(4, newDataBase.countAllBooks());
    }

    void testCountAllBooks6() {
        BookDatabaseImpl newDataBase = new BookDatabaseImpl();
        newDataBase.save(new Book("A1", "B1"));
        newDataBase.save(new Book("A2", "B2"));
        newDataBase.save(new Book("A3", "B3"));
        newDataBase.save(new Book("A4", "B4"));
        newDataBase.save(new Book("A5", "B5"));
        newDataBase.delete(new Book("A11", "B11"));
        newDataBase.delete(new Book("A3", "B3"));
        newDataBase.save(new Book("A6", "B6"));
        newDataBase.save(new Book("A2", "B2"));
        test(6, newDataBase.countAllBooks());
    }

}