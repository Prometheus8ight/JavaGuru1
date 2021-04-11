package students.andrew_galashin.lesson_11.level_2;

import java.util.Arrays;
import java.util.List;

class TestDeleteAuthor {

    public static void main(String[] args) {
        TestDeleteAuthor start = new TestDeleteAuthor();
        start.Test1();
    }

    void Test1() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1"));
        start.save(new Book("Author2", "2"));
        start.save(new Book("Author3", "3"));
        start.save(new Book("Author4", "4"));
        start.save(new Book("Author5", "5"));
        start.save(new Book("Author6", "6"));
        start.deleteAuthor("Author");
        start.deleteAuthor("Author2");
        Book[] book = {new Book("Author3", "3"), new Book("Author4", "4"), new Book("Author5", "5"), new Book("Author6", "6")};
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
