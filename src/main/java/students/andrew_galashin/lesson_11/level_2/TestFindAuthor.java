package students.andrew_galashin.lesson_11.level_2;

import java.util.Arrays;
import java.util.List;

class TestFindAuthor {

    public static void main(String[] args) {
        TestFindAuthor start = new TestFindAuthor();
        start.test1();
    }

    void test1() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author1", "1"));
        start.save(new Book("Author", "2"));
        start.save(new Book("Author3", "3"));
        start.save(new Book("Author", "4"));
        start.save(new Book("Author5", "5"));
        start.save(new Book("Author", "6"));
        Book[] book = {new Book("Author", "2"), new Book("Author", "4"), new Book("Author", "6")};
        check(Arrays.asList(book), start.findAuthor("Author"), "Test1");
    }


    void check(List<Book> result, List<Book> expected, String testName) {
        if (result.equals(expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

}
