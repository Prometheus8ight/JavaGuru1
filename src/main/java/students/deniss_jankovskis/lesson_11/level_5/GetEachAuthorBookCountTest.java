package students.deniss_jankovskis.lesson_11.level_5;

import java.util.HashMap;
import java.util.Map;

class GetEachAuthorBookCountTest {

    public static void main(String[] args) {

        GetEachAuthorBookCountTest test = new GetEachAuthorBookCountTest();
        test.getEachAuthorBookCount1();
        test.getEachAuthorBookCount2();
        test.getEachAuthorBookCount3();
    }

    public void getEachAuthorBookCount1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        Map<String, Integer> realResult = bookDatabase.getEachAuthorBookCount();
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), 1);
        checkTestResult(realResult, expectedResult, "Get Each Author Book Count Test 1");
    }

    public void getEachAuthorBookCount2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Map<String, Integer> realResult = bookDatabase.getEachAuthorBookCount();
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), 2);
        checkTestResult(realResult, expectedResult, "Get Each Author Book Count Test 2");
    }

    public void getEachAuthorBookCount3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Map<String, Integer> realResult = bookDatabase.getEachAuthorBookCount();
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put(book1.getAuthor(), 1);
        expectedResult.put(book2.getAuthor(), 2);
        checkTestResult(realResult, expectedResult, "Get Each Author Book Count Test 3");
    }

    public void checkTestResult(Map<String, Integer> realResult, Map<String, Integer> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }

}
