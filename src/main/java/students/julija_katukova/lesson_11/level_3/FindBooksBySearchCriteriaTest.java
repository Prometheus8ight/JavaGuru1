package students.julija_katukova.lesson_11.level_3;

import java.util.ArrayList;
import java.util.List;

class FindBooksBySearchCriteriaTest {

    public static void main(String[] args) {
        FindBooksBySearchCriteriaTest findBooksBySearchCriteriaTest = new FindBooksBySearchCriteriaTest();
        findBooksBySearchCriteriaTest.test1();
        findBooksBySearchCriteriaTest.test2();
        findBooksBySearchCriteriaTest.test3();
        findBooksBySearchCriteriaTest.test4();
        findBooksBySearchCriteriaTest.test5();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        List<Book> realResult = bookDatabase.find(new TitleSearchCriteria("In Search of Lost Time"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Fyodor Dostoyevsky", "The Brothers Karamazov");
        Book book2 = new Book("Marcel Proust", " In Search of Lost Time");
        Book book3 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.find(new AuthorSearchCriteria("Fyodor Dostoyevsky"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book3);
        check(realResult, expectedResult, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Fyodor Dostoyevsky", "The Brothers Karamazov");
        Book book2 = new Book("Marcel Proust", " In Search of Lost Time");
        Book book3 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        book2.setYearOfIssue("1913");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.find(new YearOfIssueSearchCriteria("1913"));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        check(realResult, expectedResult, "Test3");
    }

    private void test4() {
        Book book1 = new Book("Fyodor Dostoyevsky", "The Brothers Karamazov");
        Book book2 = new Book("Marcel Proust", " In Search of Lost Time");
        Book book3 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        book2.setYearOfIssue("1913");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.find(new AndSearchCriteria(new TitleSearchCriteria("In Search of Lost Time"), new YearOfIssueSearchCriteria("1913")));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        check(realResult, expectedResult, "Test4");
    }

    private void test5() {
        Book book1 = new Book("Fyodor Dostoyevsky", "The Brothers Karamazov");
        Book book2 = new Book("Marcel Proust", " In Search of Lost Time");
        Book book3 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        book2.setYearOfIssue("1913");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria("Fyodor Dostoyevsky"), new YearOfIssueSearchCriteria("1913")));
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        check(realResult, expectedResult, "Test5");
    }

    private void check(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
