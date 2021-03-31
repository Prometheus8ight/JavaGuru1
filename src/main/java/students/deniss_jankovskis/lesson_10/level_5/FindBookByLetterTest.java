package students.deniss_jankovskis.lesson_10.level_5;

import java.util.Arrays;

public class FindBookByLetterTest {

    public static void main(String[] args) {

        FindBookByLetterTest test = new FindBookByLetterTest();
        test.findBookByLetterTest1();
        test.findBookByLetterTest2();
    }

    public void findBookByLetterTest1() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        bookReaderImpl.addBook(book4);
        Book[] realResult = bookReaderImpl.findBookByAuthor("W");
        checkTestResult(realResult, new Book[]{book1}, "Find Book By Letter Test 1");
    }

    public void findBookByLetterTest2() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        bookReaderImpl.addBook(book4);
        Book[] realResult = bookReaderImpl.findBookByAuthor("E");
        checkTestResult(realResult, new Book[]{book3}, "Find Book By Letter Test 2");
    }

    public void checkTestResult(Book[] realResult, Book[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
