package students.deniss_jankovskis.lesson_11.level_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GetAuthorToBooksMapTest {

    public static void main(String[] args) {

        GetAuthorToBooksMapTest test = new GetAuthorToBooksMapTest();
        test.getAuthorToBooksMapTest1();
        test.getAuthorToBooksMapTest2();
        test.getAuthorToBooksMapTest3();
    }

    public void getAuthorToBooksMapTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        Map<String, List<Book>> realResult = bookDatabase.getAuthorToBooksMap();
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), bookDatabase.find(new AuthorSearchCriteria(book1.getAuthor())));
        checkTestResult(realResult, expectedResult, "Get Author To Book Map Test 1");
    }

    public void getAuthorToBooksMapTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Map<String, List<Book>> realResult = bookDatabase.getAuthorToBooksMap();
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), bookDatabase.find(new AuthorSearchCriteria(book1.getAuthor())));
        expectedResult.put(book2.getAuthor(), bookDatabase.find(new AuthorSearchCriteria(book2.getAuthor())));
        checkTestResult(realResult, expectedResult, "Get Author To Book Map Test 2");
    }

    public void getAuthorToBooksMapTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Map<String, List<Book>> realResult = bookDatabase.getAuthorToBooksMap();
        Map<String, List<Book>> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), bookDatabase.find(new AuthorSearchCriteria(book1.getAuthor())));
        expectedResult.put(book2.getAuthor(), bookDatabase.find(new AuthorSearchCriteria(book2.getAuthor())));
        expectedResult.put(book3.getAuthor(), bookDatabase.find(new AuthorSearchCriteria(book3.getAuthor())));
        checkTestResult(realResult, expectedResult, "Get Author To Book Map Test 3");
    }

    public void checkTestResult(Map<String, List<Book>> realResult, Map<String, List<Book>> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
