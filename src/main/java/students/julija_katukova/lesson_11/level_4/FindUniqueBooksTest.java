package students.julija_katukova.lesson_11.level_4;

import java.util.HashSet;
import java.util.Set;

class FindUniqueBooksTest {
    public static void main(String[] args) {
        FindUniqueBooksTest findUniqueBooksTest = new FindUniqueBooksTest();
        findUniqueBooksTest.test1();
        findUniqueBooksTest.test2();
        findUniqueBooksTest.test3();
        findUniqueBooksTest.test4();
        findUniqueBooksTest.test5();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Charles Benoit", "You");
        Book book3 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Fyodor Dostoyevsky", "Demons");
        Book book3 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        check(realResult, expectedResult, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Charles Benoit", "You");
        Book book2 = new Book("Fyodor Dostoyevsky", "Demons");
        Book book3 = new Book("Caroline Kepnes", "You");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        check(realResult, expectedResult, "Test3");
    }

    private void test4() {
        Book book1 = new Book("Charles Benoit", "You");
        Book book2 = new Book("Fyodor Dostoyevsky", "Demons");
        Book book3 = new Book("Fyodor Dostoyevsky", "Demons");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        check(realResult, expectedResult, "Test4");
    }

    private void test5() {
        Book book1 = new Book("Fyodor Dostoyevsky", "Demons");
        Book book2 = new Book("Charles Benoit", "You");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book1);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        check(realResult, expectedResult, "Test5");
    }

    private void check(Set<Book> realResult, Set<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
