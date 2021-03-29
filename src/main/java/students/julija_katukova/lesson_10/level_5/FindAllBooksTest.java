package students.julija_katukova.lesson_10.level_5;

import java.util.Arrays;

class FindAllBooksTest {

    public static void main(String[] args) {
        FindAllBooksTest addNewBookTest = new FindAllBooksTest();
        addNewBookTest.test1();
        addNewBookTest.test2();
        addNewBookTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        String[] realResult = bookReaderImpl.findAllBooks();
        check(realResult, new String[]{"Pride and Prejudice [Jane Austen]", "1984 [George Orwell]"}, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        bookReaderImpl.addNewBook(book3);
        String[] realResult = bookReaderImpl.findAllBooks();
        check(realResult, new String[]{"Pride and Prejudice [Jane Austen]", "1984 [George Orwell]", "Crime and Punishment [Fyodor Dostoyevsky]"}, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addNewBook(book1);
        String[] realResult = bookReaderImpl.findAllBooks();
        check(realResult, new String[]{"Pride and Prejudice [Jane Austen]"}, "Test3");
    }

    private void check(String[] realResult, String[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
