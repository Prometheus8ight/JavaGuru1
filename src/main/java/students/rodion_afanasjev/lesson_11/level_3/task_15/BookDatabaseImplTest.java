package students.rodion_afanasjev.lesson_11.level_3.task_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest bookDatabaseImplTest = new BookDatabaseImplTest();
        bookDatabaseImplTest.findTest();
        bookDatabaseImplTest.find2Test();
        bookDatabaseImplTest.find3Test();
        bookDatabaseImplTest.find4Test();
        bookDatabaseImplTest.find5Test();

    }

    public void findTest(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Rasol", "DTSS");
        data.save(book);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        List<Book> realResult = data.find(new TitleSearchCriteria("DTSS"));
        check(expectedResult,realResult,"findTest");
    }

    public void find2Test(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Rasol", "DTSS");
        Book book1 = new Book("Rasol", "KPSS");
        data.save(book);
        data.save(book1);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        expectedResult.add(book1);
        List<Book> realResult = data.find(new AuthorSearchCriteria("Rasol"));
        check(expectedResult,realResult,"find2Test");
    }

    public void find3Test(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Rasol", "DTSS");
        Book book1 = new Book("Rasol", "KPSS");
        book.setYearOfIssue("2021");
        data.save(book);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        List<Book> realResult = data.find(new YearOfIssueSearchCriteria("2021"));
        check(expectedResult,realResult,"find3Test");
    }

    public void find4Test(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Rasol", "DTSS");
        Book book1 = new Book("Rasol", "KPSS");
        book.setYearOfIssue("2021");
        data.save(book);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        List<Book> realResult = data.find(new AndSearchCriteria(new AuthorSearchCriteria("Rasol"), new YearOfIssueSearchCriteria("2021")));
        check(expectedResult,realResult,"find4Test");
    }

    public void find5Test(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Rasol", "DTSS");
        Book book1 = new Book("Rasol", "KPSS");
        book.setYearOfIssue("2021");
        data.save(book);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        List<Book> realResult = data.find(new AndSearchCriteria(new TitleSearchCriteria("DTSS"), new YearOfIssueSearchCriteria("2021")));
        check(expectedResult,realResult,"find5Test");
    }

    public void check(List<Book> expectedResult, List<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
