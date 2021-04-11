package students.andrew_galashin.lesson_11.level_2;

import java.util.Arrays;
import java.util.List;

class TestDeleteTitle {
    public static void main(String[] args) {
        TestDeleteTitle start = new TestDeleteTitle();
        start.Test1();
    }

    void Test1() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1"));
        start.save(new Book("Author2", "2"));
        start.save(new Book("Author3", "3"));
        start.save(new Book("Author4", "4"));
        start.save(new Book("Author5", "5"));
        start.deleteTitle("1");
        start.deleteTitle("2");
        Book[] book = {new Book("Author3", "3"), new Book("Author4", "4"), new Book("Author5", "5")};
        check(Arrays.asList(book), start.getLibrary(), "Test1");
    }

    void check(List<Book> result, List<Book> expected, String testName) {
        if (result.equals(expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
