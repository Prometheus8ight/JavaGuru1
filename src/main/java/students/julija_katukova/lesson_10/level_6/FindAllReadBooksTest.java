package students.julija_katukova.lesson_10.level_6;

import java.util.Arrays;

class FindAllReadBooksTest {
    public static void main(String[] args) {
        FindAllReadBooksTest wasReadTest = new FindAllReadBooksTest();
        wasReadTest.test1();
        wasReadTest.test2();
        wasReadTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        bookReaderImpl.wasRead(book2);
        Book[] realResult = bookReaderImpl.findAllReadBooks();
        Book[] expectedResult = {book2};
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        bookReaderImpl.wasRead(book1);
        bookReaderImpl.wasRead(book2);
        Book[] realResult = bookReaderImpl.findAllReadBooks();
        Book[] expectedResult = {book1, book2};
        check(realResult, expectedResult, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        Book[] realResult = bookReaderImpl.findAllReadBooks();
        Book[] expectedResult = new Book[0];
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
