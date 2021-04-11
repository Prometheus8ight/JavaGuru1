package students.julija_katukova.lesson_10.level_5;

import java.util.Arrays;

class FindAllBooksTest {

    BookValidator bookValidator = new BookValidator();

    public static void main(String[] args) {
        FindAllBooksTest addNewBookTest = new FindAllBooksTest();
        addNewBookTest.test1();
        addNewBookTest.test2();
        addNewBookTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl(bookValidator);
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        Book[] realResult = bookReaderImpl.findAll();
        Book[] expectedResult = {book1, book2};
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl(bookValidator);
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        bookReaderImpl.add(book3);
        Book[] realResult = bookReaderImpl.findAll();
        Book[] expectedResult = {book1, book2, book3};
        check(realResult, expectedResult, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        BookReaderImpl bookReaderImpl = new BookReaderImpl(bookValidator);
        bookReaderImpl.add(book1);
        Book[] realResult = bookReaderImpl.findAll();
        Book[] expectedResult = {book1};
        check(realResult, expectedResult, "Test3");
    }

    private void check(Book[] realResult, Book[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
