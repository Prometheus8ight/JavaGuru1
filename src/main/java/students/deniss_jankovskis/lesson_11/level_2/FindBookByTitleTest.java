package students.deniss_jankovskis.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;

class FindBookByTitleTest {

    public static void main(String[] args) {

        FindBookByTitleTest test = new FindBookByTitleTest();
        test.findBookByTitleTest1();
        test.findBookByTitleTest2();
        test.findBookByTitleTest3();
    }

    public void findBookByTitleTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        List<Book> realResult = bookDatabase.findByTitle("The Great Gatsby");
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Find Book By Title Test 1");
    }

    private void findBookByTitleTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        List<Book> realResult = bookDatabase.findByTitle("The Great Gatsby");
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Find Book By Title Test 2");
    }

    private void findBookByTitleTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.findByTitle("The Great Gatsby");
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Find Book By Title Test 3");
    }

    public void checkTestResult(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
