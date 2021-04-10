package students.andrew_galashin.lesson_11.level_2;

import java.util.Optional;

class TestFindId {

    public static void main(String[] args) {
        TestFindId start = new TestFindId();
        start.test1();
        start.test2();
    }


    void test1() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1"));
        start.save(new Book("Author2", "2"));
        start.save(new Book("Author3", "3"));
        Optional<Book> result = Optional.of(new Book("Author2", "2"));
        check(result, start.findId(2L), "Test1");
    }

    void test2() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1"));
        start.save(new Book("Author2", "2"));
        ;
        start.save(new Book("Author3", "3"));
        Optional<Book> result = Optional.empty();
        check(result, start.findId(4L), "Test2");
    }

    void check(Optional<Book> result, Optional<Book> expected, String testName) {
        if (result.equals(expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

}
