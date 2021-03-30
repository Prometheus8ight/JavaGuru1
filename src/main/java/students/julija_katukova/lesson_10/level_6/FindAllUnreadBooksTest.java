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
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        bookReaderImpl.wasUnread(book2);
        String[] realResult = bookReaderImpl.findAllUnreadBooks();
        check(realResult, new String[]{"1984 [George Orwell]"}, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        bookReaderImpl.wasUnread(book1);
        bookReaderImpl.wasUnread(book2);
        String[] realResult = bookReaderImpl.findAllUnreadBooks();
        check(realResult, new String[]{"Pride and Prejudice [Jane Austen]", "1984 [George Orwell]"}, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        String[] realResult = bookReaderImpl.findAllUnreadBooks();
        check(realResult, new String[]{}, "Test3");
    }

    private void check(String[] realResult, String[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
