package students.julija_katukova.lesson_11.level_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GetAuthorToBooksMapTest {
    public static void main(String[] args) {
        GetAuthorToBooksMapTest getAuthorToBooksMapTest = new GetAuthorToBooksMapTest();
        getAuthorToBooksMapTest.test1();
        getAuthorToBooksMapTest.test2();
        getAuthorToBooksMapTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        Map<String, List<Book>> realResult = bookDatabase.getAuthorToBooksMap();
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), bookDatabase.find(new AuthorSearchCriteria(book1.getAuthor())));
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Marcel Proust", "Remembrance of Things Past");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Map<String, List<Book>> realResult = bookDatabase.getAuthorToBooksMap();
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), bookDatabase.find(new AuthorSearchCriteria(book1.getAuthor())));
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
        Map<String, List<Book>> realResult = bookDatabase.getAuthorToBooksMap();
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), bookDatabase.find(new AuthorSearchCriteria(book1.getAuthor())));
        expectedResult.put(book2.getAuthor(), bookDatabase.find(new AuthorSearchCriteria(book2.getAuthor())));
        check(realResult, expectedResult, "Test3");
    }

    private void check(Map<String, List<Book>> realResult, Map<String, List<Book>> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
