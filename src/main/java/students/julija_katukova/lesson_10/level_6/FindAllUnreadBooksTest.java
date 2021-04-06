package students.julija_katukova.lesson_10.level_6;

import java.util.Arrays;

class FindAllUnreadBooksTest {
    public static void main(String[] args) {
        FindAllUnreadBooksTest wasUnreadTest = new FindAllUnreadBooksTest();
        wasUnreadTest.test1();
        wasUnreadTest.test2();
        wasUnreadTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        bookReaderImpl.wasUnread(book2);
        Book[] realResult = bookReaderImpl.findAllUnreadBooks();
        Book[] expectedResult = {book2};
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        bookReaderImpl.wasUnread(book1);
        bookReaderImpl.wasUnread(book2);
        Book[] realResult = bookReaderImpl.findAllUnreadBooks();
        Book[] expectedResult = {book1, book2};
        check(realResult, expectedResult, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        Book[] realResult = bookReaderImpl.findAllUnreadBooks();
        Book[] expectedResult = {};
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
