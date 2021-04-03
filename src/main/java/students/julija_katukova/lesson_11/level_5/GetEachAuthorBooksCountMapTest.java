package students.julija_katukova.lesson_11.level_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GetEachAuthorBooksCountMapTest {
    public static void main(String[] args) {
        GetEachAuthorBooksCountMapTest getEachAuthorBooksCountMapTest = new GetEachAuthorBooksCountMapTest();
        getEachAuthorBooksCountMapTest.test1();
        getEachAuthorBooksCountMapTest.test2();
        getEachAuthorBooksCountMapTest.test3();
        getEachAuthorBooksCountMapTest.test5();
        getEachAuthorBooksCountMapTest.test6();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        Map<String, Integer> realResult = bookDatabase.getEachAuthorBookCount();
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), 1);
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Marcel Proust", "Remembrance of Things Past");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Map<String, Integer> realResult = bookDatabase.getEachAuthorBookCount();
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), 2);
        check(realResult, expectedResult, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Fyodor Dostoyevsky", "The Brothers Karamazov");
        Book book3 = new Book("Marcel Proust", "Remembrance of Things Past");
        Book book4 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Map<String, Integer> realResult = bookDatabase.getEachAuthorBookCount();
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), 2);
        expectedResult.put(book2.getAuthor(), 2);
        check(realResult, expectedResult, "Test3");
    }

    private void test5() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book1);
        Map<String, Integer> realResult = bookDatabase.getEachAuthorBookCount();
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), 1);
        check(realResult, expectedResult, "Test5");
    }

    private void test6() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Marcel Proust", "In Search of Lost Time");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Map<String, Integer> realResult = bookDatabase.getEachAuthorBookCount();
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), 1);
        check(realResult, expectedResult, "Test6");
    }

    private void check(Map<String, Integer> realResult, Map<String, Integer> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
