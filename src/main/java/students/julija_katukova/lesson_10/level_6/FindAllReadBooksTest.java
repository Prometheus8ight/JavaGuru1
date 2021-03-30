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
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        bookReaderImpl.wasRead(book2);
        String[] realResult = bookReaderImpl.findAllReadBooks();
        check(realResult, new String[]{"1984 [George Orwell]"}, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        bookReaderImpl.wasRead(book1);
        bookReaderImpl.wasRead(book2);
        String[] realResult = bookReaderImpl.findAllReadBooks();
        check(realResult, new String[]{"Pride and Prejudice [Jane Austen]", "1984 [George Orwell]"}, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        String[] realResult = bookReaderImpl.findAllReadBooks();
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
