package students.deniss_jankovskis.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;

class DeleteBookByTitleTest {

    public static void main(String[] args) {

        DeleteBookByTitleTest test = new DeleteBookByTitleTest();
        test.deleteBookByTitleTest1();
        test.deleteBookByTitleTest2();
        test.deleteBookByTitleTest3();
    }

    public void deleteBookByTitleTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.deleteByTitle("The Great Gatsby");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Title Test 1");
    }

    public void deleteBookByTitleTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.deleteByTitle("The Great Gatsby");
        bookDatabase.deleteByTitle("War and Peace");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Title Test 2");
    }

    public void deleteBookByTitleTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByTitle("The Great Gatsby");
        bookDatabase.deleteByTitle("War and Peace");
        bookDatabase.deleteByTitle("Madame Bovary");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Title Test 3");
    }

    public void checkTestResult(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
