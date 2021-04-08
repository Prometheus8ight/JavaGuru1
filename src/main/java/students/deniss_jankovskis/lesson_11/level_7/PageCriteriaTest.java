package students.deniss_jankovskis.lesson_11.level_7;

import java.util.ArrayList;
import java.util.List;

class PageCriteriaTest {

    public static void main(String[] args) {

        PageCriteriaTest test = new PageCriteriaTest();
        test.pageCriteriaTest1();
        test.pageCriteriaTest2();
        test.pageCriteriaTest3();
    }

    public void pageCriteriaTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        PageCriteria pageCriteria = new PageCriteria();
        List<Book> realResult = pageCriteria.bookList(bookDatabase.getBooks());
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        pageCriteria.setPageNumber(1);
        pageCriteria.setPageSize(1);
        realResult = pageCriteria.bookList(bookDatabase.getBooks());
        expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        checkTestResult(realResult, expectedResult, "Page Criteria Test 1");
    }

    public void pageCriteriaTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        PageCriteria pageCriteria = new PageCriteria();
        List<Book> realResult = pageCriteria.bookList(bookDatabase.getBooks());
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        pageCriteria.setPageNumber(1);
        pageCriteria.setPageSize(2);
        realResult = pageCriteria.bookList(bookDatabase.getBooks());
        expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        checkTestResult(realResult, expectedResult, "Page Criteria Test 2");
    }

    public void pageCriteriaTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        PageCriteria pageCriteria = new PageCriteria();
        List<Book> realResult = pageCriteria.bookList(bookDatabase.getBooks());
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        pageCriteria.setPageNumber(1);
        pageCriteria.setPageSize(3);
        realResult = pageCriteria.bookList(bookDatabase.getBooks());
        expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        checkTestResult(realResult, expectedResult, "Page Criteria Test 3");
    }

    public void checkTestResult(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
