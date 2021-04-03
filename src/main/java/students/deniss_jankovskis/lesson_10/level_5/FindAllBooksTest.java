package students.deniss_jankovskis.lesson_10.level_5;

import java.util.Arrays;

public class FindAllBooksTest {

    public static void main(String[] args) {

        FindAllBooksTest test = new FindAllBooksTest();
        test.findAllBooksTest1();
        test.findAllBooksTest2();
        test.findAllBooksTest3();
        test.findAllBooksTest4();
    }

    public void findAllBooksTest1() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        String[] realResult = bookReaderImpl.findAllBooks();
        checkTestResult(realResult, new String[]{"ABSALOM, ABSALOM! by WILLIAM FAULKNER"}, "Find All Books Test 1");
    }

    public void findAllBooksTest2() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        String[] realResult = bookReaderImpl.findAllBooks();
        checkTestResult(realResult, new String[]{"ABSALOM, ABSALOM! by WILLIAM FAULKNER", "A TIME TO KILL by JOHN GRISHAM"}, "Find All Books Test 2");
    }

    public void findAllBooksTest3() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        String[] realResult = bookReaderImpl.findAllBooks();
        checkTestResult(realResult, new String[]{"ABSALOM, ABSALOM! by WILLIAM FAULKNER", "A TIME TO KILL by JOHN GRISHAM", "THE HOUSE OF MIRTH by EDITH WHARTON"}, "Find All Books Test 3");
    }

    public void findAllBooksTest4() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        bookReaderImpl.addBook(book4);
        String[] realResult = bookReaderImpl.findAllBooks();
        checkTestResult(realResult, new String[]{"ABSALOM, ABSALOM! by WILLIAM FAULKNER", "A TIME TO KILL by JOHN GRISHAM", "THE HOUSE OF MIRTH by EDITH WHARTON", "EAST OF EDEN by JOHN STEINBECK"}, "Find All Books Test 4");
    }

    public void checkTestResult(String[] realResult, String[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
