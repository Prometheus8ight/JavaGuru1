package students.deniss_jankovskis.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;

public class FindBookByAuthorTest {

    public static void main(String[] args) {

        FindBookByAuthorTest test = new FindBookByAuthorTest();
        test.findBookByAuthorTest1();
        test.findBookByAuthorTest2();
        test.findBookByAuthorTest3();
    }

    public void findBookByAuthorTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        List<Book> realResult = bookDatabase.findByAuthor("F. Scott Fitzgerald");
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Find Book By Author Test 1");
    }

    public void findBookByAuthorTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        List<Book> realResult = bookDatabase.findByAuthor("Leo Tolstoy");
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Find Book By Author Test 2");
    }

    public void findBookByAuthorTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.findByAuthor("Gustave Flaubert");
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Find Book By Author Test 3");
    }

    public void checkTestResult(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
