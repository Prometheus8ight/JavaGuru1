package students.andrew_galashin.lesson_11.level_2;

import java.util.Arrays;
import java.util.List;

class TestFindTitle {

    public static void main(String[] args) {
        TestFindTitle start = new TestFindTitle();
        start.Test1();
    }

    void Test1() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1"));
        start.save(new Book("Author2", "2"));
        start.save(new Book("Author3", "3"));
        start.save(new Book("Author4", "2"));
        start.save(new Book("Author5", "5"));
        start.save(new Book("Author6", "6"));
        start.save(new Book("Author7", "7"));
        Book[] result = {new Book("Author2", "2"), new Book("Author4", "2")};
        check(Arrays.asList(result), start.findTitle("2"), "Test1");
    }

    void check(List<Book> result, List<Book> expected, String testName) {
        if (result.equals(expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

}
