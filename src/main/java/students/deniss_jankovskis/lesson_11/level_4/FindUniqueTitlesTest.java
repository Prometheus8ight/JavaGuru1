package students.deniss_jankovskis.lesson_11.level_4;

import java.util.HashSet;
import java.util.Set;

class FindUniqueTitlesTest {

    public static void main(String[] args) {

        FindUniqueTitlesTest test = new FindUniqueTitlesTest();
        test.findUniqueTitlesTest1();
        test.findUniqueTitlesTest2();
        test.findUniqueTitlesTest3();
    }

    public void findUniqueTitlesTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        Set<String> realResult = bookDatabase.findUniqueTitles();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book1.getTitle());
        checkTestResult(realResult, expectedResult, "Find Unique Titles Test 1");
    }

    public void findUniqueTitlesTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Set<String> realResult = bookDatabase.findUniqueTitles();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book1.getTitle());
        expectedResult.add(book2.getTitle());
        checkTestResult(realResult, expectedResult, "Find Unique Titles Test 2");
    }

    public void findUniqueTitlesTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> realResult = bookDatabase.findUniqueTitles();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book1.getTitle());
        expectedResult.add(book2.getTitle());
        expectedResult.add(book3.getTitle());
        checkTestResult(realResult, expectedResult, "Find Unique Titles Test 3");
    }

    public void checkTestResult(Set<String> realResult, Set<String> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
