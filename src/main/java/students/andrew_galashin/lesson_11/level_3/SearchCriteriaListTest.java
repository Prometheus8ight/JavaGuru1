package students.andrew_galashin.lesson_11.level_3;

import java.util.Arrays;
import java.util.List;

public class SearchCriteriaListTest {
    public static void main(String[] args) {
        SearchCriteriaListTest start = new SearchCriteriaListTest();
        start.test1();
        start.test2();
        start.test3();
        start.test4();
        start.test5();
        start.test6();
    }

    void test1() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1", "2001"));
        start.save(new Book("Author2", "2", "2002"));
        start.save(new Book("Author3", "3", "2003"));
        start.save(new Book("Author4", "4", "2004"));
        start.save(new Book("Author5", "5", "2005"));
        Book[] book = {new Book("Author3", "3", "2003")};
        check(Arrays.asList(book), start.find(new AndSearchCriteria(new TitleSearchCriteria("3"), new AuthorSearchCriteria("Author3"))), "Test1");
    }

    void test2() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1", "2001"));
        start.save(new Book("Author2", "2", "2002"));
        start.save(new Book("Author3", "3", "2003"));
        start.save(new Book("Author4", "4", "2004"));
        start.save(new Book("Author5", "5", "2005"));
        Book[] book = {new Book("Author2", "2", "2002")};
        check(Arrays.asList(book), start.find(new AndSearchCriteria(new YearOfIssueSearchCriteria("2002"), new AuthorSearchCriteria("Author2"))), "Test2");
    }

    void test3() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1", "2001"));
        start.save(new Book("Author2", "2", "2002"));
        start.save(new Book("Author3", "3", "2003"));
        start.save(new Book("Author4", "4", "2004"));
        start.save(new Book("Author5", "5", "2005"));
        Book[] book = {new Book("Author", "1", "2001")};
        check(Arrays.asList(book), start.find(new AndSearchCriteria(new TitleSearchCriteria("1"), new YearOfIssueSearchCriteria("2001"))), "Test3");
    }

    void test4() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1", "2001"));
        start.save(new Book("Author2", "2", "2002"));
        start.save(new Book("Author3", "3", "2003"));
        start.save(new Book("Author4", "4", "2004"));
        start.save(new Book("Author5", "5", "2005"));
        Book[] book = {new Book("Author4", "4", "2004")};
        check(Arrays.asList(book), start.find(new OrSearchCriteria(new TitleSearchCriteria("4"), new AuthorSearchCriteria("Author4"))), "Test4");
    }

    void test5() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1", "2001"));
        start.save(new Book("Author2", "2", "2002"));
        start.save(new Book("Author3", "3", "2003"));
        start.save(new Book("Author4", "4", "2004"));
        start.save(new Book("Author5", "5", "2005"));
        Book[] book = {new Book("Author5", "5", "2005")};
        check(Arrays.asList(book), start.find(new OrSearchCriteria(new TitleSearchCriteria("Author5"), new YearOfIssueSearchCriteria("2005"))), "Test5");
    }

    void test6() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1", "2001"));
        start.save(new Book("Author2", "2", "2002"));
        start.save(new Book("Author3", "3", "2003"));
        start.save(new Book("Author4", "4", "2004"));
        start.save(new Book("Author5", "5", "2005"));
        Book[] book = {new Book("Author", "1", "2001")};
        check(Arrays.asList(book), start.find(new OrSearchCriteria(new AuthorSearchCriteria("Author"), new YearOfIssueSearchCriteria("2001"))), "Test6");
    }

    void check(List<Book> result, List<Book> expected, String testName) {
        if (result.equals(expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
