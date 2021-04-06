package students.deniss_jankovskis.lesson_11.level_4;

import java.util.HashSet;
import java.util.Set;

class FindUniqueBooksTest {

    public static void main(String[] args) {

        FindUniqueBooksTest test = new FindUniqueBooksTest();
        test.findUniqueBooksTest1();
        test.findUniqueBooksTest2();
        test.findUniqueBooksTest3();
    }

    public void findUniqueBooksTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1);
        checkTestResult(realResult, expectedResult, "Find Unique Books Test 1");
    }

    public void findUniqueBooksTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        checkTestResult(realResult, expectedResult, "Find Unique Books Test 2");
    }

    public void findUniqueBooksTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<Book> realResult = bookDatabase.findUniqueBooks();
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        checkTestResult(realResult, expectedResult, "Find Unique Books Test 3");
    }

    public void checkTestResult(Set<Book> realResult, Set<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
