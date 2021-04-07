package students.rodion_afanasjev.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImplTest {

    public static void main(String[] args) {

        BookDatabaseImplTest bookDatabaseImplTest = new BookDatabaseImplTest();
        bookDatabaseImplTest.saveTest();
        bookDatabaseImplTest.deleteByIdTest();
        bookDatabaseImplTest.deleteByBookParametersTest();
        bookDatabaseImplTest.findByIdTest();
        bookDatabaseImplTest.findByIdFailTest();
        bookDatabaseImplTest.findByAuthorTest();
        bookDatabaseImplTest.findByTitleTest();
        bookDatabaseImplTest.countAllBooksTest();
        bookDatabaseImplTest.deleteByAuthorTest();
        bookDatabaseImplTest.deleteByTitleTest();

    }

    private void saveTest(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book1 = new Book("Slava","KPSS");
        Book book2 = new Book("Slava","KPSS");
        Book book3 = new Book("Slava","KPSS");
        data.save(book1);
        data.save(book2);
        long expectedResult = 3;
        long realResult = data.save(book3);
        check(realResult,expectedResult,"saveTest");
    }

    private void deleteByIdTest(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Slava","KPSS");
        data.save(book);
        boolean realResult = data.delete(1L);
        check2(realResult, true,"deleteByIdTest");
    }

    public void deleteByBookParametersTest(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Slava","KPSS");
        data.save(book);
        boolean realResult = data.delete(book);
        check2(realResult, true,"deleteByBookParametersTest");
    }

    public void findByIdTest(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Slava","KPSS");
        data.save(book);
        Optional<Book> expectedResult = Optional.of(book);
        Optional<Book> realResult = data.findById(1L);
        check3(realResult,expectedResult,"findByIdTest");
    }

    public void findByIdFailTest(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Slava","KPSS");
        data.save(book);
        Optional<Book> expectedResult = Optional.empty();
        Optional<Book> realResult = data.findById(2L);
        check3(realResult,expectedResult,"findByIdFailTest");
    }

    public void findByAuthorTest(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Slava","KPSS");
        data.save(book);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        List<Book> realResult = data.findByAuthor("Slava");
        check4(realResult,expectedResult,"findByAuthorTest");
    }

    public void findByTitleTest(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Slava","KPSS");
        data.save(book);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book);
        List<Book> realResult = data.findByTitle("KPSS");
        check4(realResult,expectedResult,"findByTitleTest");
    }

    public void countAllBooksTest(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book1 = new Book("Slava","KPSS");
        Book book2 = new Book("Slava","KPSS");
        data.save(book1);
        data.save(book2);
        int expectedResult = 2;
        int realResult = data.countAllBooks();
        check(realResult,expectedResult,"countAllBooksTest");
    }

    public void deleteByAuthorTest(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Rasol","DTSS");
        data.save(book);
        data.deleteByAuthor("Rasol");
        List<Book> expectedResult = new ArrayList<>();
        List<Book> realResult = data.getBooks();
        check4(realResult,expectedResult,"deleteByAuthorTest");
    }

    public void deleteByTitleTest(){
        BookDatabaseImpl data = new BookDatabaseImpl();
        Book book = new Book("Rasol","DTSS");
        data.save(book);
        data.deleteByTitle("DTSS");
        List<Book> expectedResult = new ArrayList<>();
        List<Book> realResult = data.getBooks();
        check4(realResult,expectedResult,"deleteByTitleTest");
    }

    public void check(long realResult, long expectedResult, String testName){
        if(realResult == expectedResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

    public void check2(boolean realResult, boolean expectedResult, String testName){
        if(realResult == expectedResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

    public void check3(Optional<Book> realResult, Optional<Book> expectedResult, String testName){
        if(realResult.equals(expectedResult)){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

    public void check4(List<Book> realResult, List<Book> expectedResult, String testName){
        if(realResult.equals(expectedResult)){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
