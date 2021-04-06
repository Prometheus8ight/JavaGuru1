package students.deniss_jankovskis.lesson_11.level_3;

import java.util.ArrayList;
import java.util.List;

class BookSearchCriteriaTest {

    public static void main(String[] args) {

        BookSearchCriteriaTest test = new BookSearchCriteriaTest();
        test.bookSearchCriteriaTest1();
        test.bookSearchCriteriaTest2();
        test.bookSearchCriteriaTest3();
        test.bookSearchCriteriaTest4();
    }

    public void bookSearchCriteriaTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        Book book4 = new Book("Kuper", "Zveroboi");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        book4.setYearOfIssue("1890");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> realResult = bookDatabase.find(new TitleSearchCriteria("The Great Gatsby"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        checkTestResult(realResult, expectedResult, "Book Search Criteria Test 1");
    }

    public void bookSearchCriteriaTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        Book book4 = new Book("Kuper", "Zveroboi");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        book4.setYearOfIssue("1890");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> realResult = bookDatabase.find(new AuthorSearchCriteria("Leo Tolstoy"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        checkTestResult(realResult, expectedResult, "Book Search Criteria Test 2");
    }

    public void bookSearchCriteriaTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        Book book4 = new Book("Kuper", "Zveroboi");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        book4.setYearOfIssue("1890");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> realResult = bookDatabase.find(new YearOfIssueSearchCriteria("1856"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        checkTestResult(realResult, expectedResult, "Book Search Criteria Test 3");
    }

    public void bookSearchCriteriaTest4() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        Book book4 = new Book("Kuper", "Zveroboi");
        book1.setYearOfIssue("1925");
        book2.setYearOfIssue("1867");
        book3.setYearOfIssue("1856");
        book4.setYearOfIssue("1890");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> realResult = bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria("Kuper"), new YearOfIssueSearchCriteria("1890")));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book4);
        checkTestResult(realResult, expectedResult, "Book Search Criteria Test 4");
    }

    public void checkTestResult(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
