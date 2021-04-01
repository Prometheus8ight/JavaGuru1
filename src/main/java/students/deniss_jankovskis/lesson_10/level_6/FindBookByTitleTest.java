package students.deniss_jankovskis.lesson_10.level_6;

import java.util.Arrays;

class FindBookByTitleTest {

    public static void main(String[] args) {

        FindBookByTitleTest test = new FindBookByTitleTest();
        test.findBookByTitleTest1();
        test.findBookByTitleTest2();
    }

    public void findBookByTitleTest1() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        bookReaderImpl.addBook(book4);
        Book[] realResult = bookReaderImpl.findBooksByTitle("THE HOUSE");
        checkTestResult(realResult, new Book[]{book3}, "Find Book By Title Test 1");
    }

    public void findBookByTitleTest2() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        bookReaderImpl.addBook(book4);
        Book[] realResult = bookReaderImpl.findBooksByTitle("ABSALOM");
        checkTestResult(realResult, new Book[]{book1}, "Find Book By Title Test 2");
    }

    public void checkTestResult(Book[] realResult, Book[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
