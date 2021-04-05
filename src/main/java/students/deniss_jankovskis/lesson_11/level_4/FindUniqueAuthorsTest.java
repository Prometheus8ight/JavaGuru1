package students.deniss_jankovskis.lesson_11.level_4;

import java.util.HashSet;
import java.util.Set;

class FindUniqueAuthorsTest {

    public static void main(String[] args) {

        FindUniqueAuthorsTest test = new FindUniqueAuthorsTest();
        test.findUniqueAuthorsTest1();
        test.findUniqueAuthorsTest2();
        test.findUniqueAuthorsTest3();
    }

    public void findUniqueAuthorsTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        Set<String> realResult = bookDatabase.findUniqueAuthors();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book1.getAuthor());
        checkTestResult(realResult, expectedResult, "Find Unique Author Test 1");
    }

    public void findUniqueAuthorsTest2() {
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book2);
        Set<String> realResult = bookDatabase.findUniqueAuthors();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book2.getAuthor());
        checkTestResult(realResult, expectedResult, "Find Unique Author Test 2");
    }

    public void findUniqueAuthorsTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> realResult = bookDatabase.findUniqueAuthors();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book1.getAuthor());
        expectedResult.add(book2.getAuthor());
        expectedResult.add(book3.getAuthor());
        checkTestResult(realResult, expectedResult, "Find Unique Author Test 3");
    }

    public void checkTestResult(Set<String> realResult, Set<String> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
