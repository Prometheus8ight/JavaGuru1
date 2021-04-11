package students.andrew_galashin.lesson_11.level_2;

import java.util.Arrays;
import java.util.List;

class TestDeleteId {

    public static void main(String[] args) {
        TestDeleteId start = new TestDeleteId();
        start.test1();
        start.test2();
    }

    void test1() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        Book[] result = {new Book("Author", "1"), new Book("Author3", "3")};
        start.save(new Book("Author", "1"));
        start.save(new Book("Author2", "2"));
        start.save(new Book("Author3", "3"));
        start.deleteId(2L);
        checkT(Arrays.asList(result), start.getLibrary(), "Test1");
    }

    void test2() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1"));
        start.save(new Book("Author2", "2"));
        start.save(new Book("Author3", "3"));
        start.deleteId(2L);
        checkF(false, start.deleteId(5L), "Test2");
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
