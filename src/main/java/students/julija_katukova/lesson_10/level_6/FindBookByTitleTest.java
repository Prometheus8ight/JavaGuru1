package students.julija_katukova.lesson_10.level_6;

import java.util.Arrays;

public class FindBookByTitleTest {
    public static void main(String[] args) {
        FindBookByTitleTest findBookByTitleTest = new FindBookByTitleTest();
        findBookByTitleTest.test1();
        findBookByTitleTest.test2();
        findBookByTitleTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("The Brothers Karamazov", "Fyodor Dostoyevsky");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        bookReaderImpl.addNewBook(book3);
        Book[] realResult = bookReaderImpl.findBooksByTitle("Pride and Prejudice");
        check(realResult, new Book[]{book1}, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("The Brothers Karamazov", "Fyodor Dostoyevsky");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        bookReaderImpl.addNewBook(book3);
        Book[] realResult = bookReaderImpl.findBooksByTitle("The Brothers Karamazov");
        check(realResult, new Book[]{book2}, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("The Brothers Karamazov", "Fyodor Dostoyevsky");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        Book book4 = new Book("Demons", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        bookReaderImpl.addNewBook(book3);
        bookReaderImpl.addNewBook(book4);
        Book[] realResult = bookReaderImpl.findBooksByTitle("Demons");
        check(realResult, new Book[]{book4}, "Test3");
    }

    private void check(Book[] realResult, Book[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
