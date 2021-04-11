package students.andrew_galashin.lesson_11.level_2;

import java.util.Arrays;
import java.util.List;

class TestSaveBook {

    public static void main(String[] args) {
        TestSaveBook start = new TestSaveBook();
        start.test1();
    }

    void test1() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1"));
        start.save(new Book("Author2", "2"));
        start.save(new Book("Author3", "3"));
        Book[] result = {new Book("Author", "1"), new Book("Author2", "2"), new Book("Author3", "3")};
        check(Arrays.asList(result), start.getLibrary(), "Test1");
    }

    void check(List<Book> result, List<Book> expected, String testName) {
        if (result.equals(expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

}
