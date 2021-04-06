package students.deniss_jankovskis.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;

class DeleteBookByAuthorTest {

    public static void main(String[] args) {

        DeleteBookByAuthorTest test = new DeleteBookByAuthorTest();
        test.deleteBookByAuthorTest1();
        test.deleteBookByAuthorTest2();
        test.deleteBookByAuthorTest3();
    }

    public void deleteBookByAuthorTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.deleteByAuthor("F. Scott Fitzgerald");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Author Test 1");
    }

    public void deleteBookByAuthorTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.deleteByAuthor("F. Scott Fitzgerald");
        bookDatabase.deleteByAuthor("Leo Tolstoy");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Author Test 2");
    }

    public void deleteBookByAuthorTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByAuthor("F. Scott Fitzgerald");
        bookDatabase.deleteByAuthor("Leo Tolstoy");
        bookDatabase.deleteByAuthor("Gustave Flaubert");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Author Test 3");
    }

    public void checkTestResult(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
