package students.andrew_galashin.lesson_11.level_2;

import java.util.Arrays;
import java.util.List;

class TestDeleteObj {

    public static void main(String[] args) {
        TestDeleteObj start = new TestDeleteObj();
        start.Test1();
        start.Test2();
    }


    void Test1() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        Book[] result = {new Book("Author", "1"), new Book("Author3", "3")};
        start.save(new Book("Author", "1"));
        start.save(new Book("Author2", "2"));
        start.save(new Book("Author3", "3"));
        start.deleteObject(new Book("Author2", "2"));
        checkT(Arrays.asList(result), start.getLibrary(), "Test1");
    }

    void Test2() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1"));
        start.save(new Book("Author2", "2"));
        start.save(new Book("Author3", "3"));
        checkF(false, start.deleteObject(new Book("Author4", "4")), "Test2");
    }


    void checkT(List<Book> result, List<Book> expected, String testName) {
        if (result.equals(expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

    void checkF(boolean result, boolean expected, String testName) {
        if (!result == !expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

}
