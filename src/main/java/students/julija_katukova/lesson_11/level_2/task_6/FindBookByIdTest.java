package students.julija_katukova.lesson_11.level_2.task_6;

import java.util.Optional;

class FindBookByIdTest {

    public static void main(String[] args) {
        FindBookByIdTest findBookByIdTest = new FindBookByIdTest();
        findBookByIdTest.test1();
        findBookByIdTest.test2();
        findBookByIdTest.test3();
        findBookByIdTest.test4();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        Optional<Book> realResult = bookDatabase.findById(1L);
        check(realResult, Optional.of(book1), "Test1");
    }

    private void test2() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("James Joyce", "Ulysses");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Optional<Book> realResult = bookDatabase.findById(1L);
        check(realResult, Optional.of(book1), "Test2");
    }

    private void test3() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("James Joyce", "Ulysses");
        Book book3 = new Book("Miguel de Cervantes", "Don Quixote");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Optional<Book> realResult = bookDatabase.findById(2L);
        check(realResult, Optional.of(book2), "Test3");
    }

    private void test4() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("James Joyce", "Ulysses");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Optional<Book> realResult = bookDatabase.findById(3L);
        check(realResult, Optional.empty(), "Test4");
    }

    private void check(Optional<Book> realResult, Optional<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
