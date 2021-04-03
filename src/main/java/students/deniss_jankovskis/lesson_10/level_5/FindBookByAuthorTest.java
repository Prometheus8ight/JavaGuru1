package students.deniss_jankovskis.lesson_10.level_5;

import java.util.Arrays;

class FindBookByAuthorTest {

    public static void main(String[] args) {

        FindBookByAuthorTest test = new FindBookByAuthorTest();
        test.findBookByAuthorTest1();
        test.findBookByAuthorTest2();
    }

    public void findBookByAuthorTest1() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        Book[] realResult = bookReaderImpl.findBookByAuthor("WILLIAM FAULKNER");
        checkTestResult(realResult, new Book[]{book1}, "Find Book By Author Test 1");
    }

    public void findBookByAuthorTest2() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        bookReaderImpl.addBook(book4);
        Book[] realResult = bookReaderImpl.findBookByAuthor("EDITH WHARTON");
        checkTestResult(realResult, new Book[]{book3}, "Find Book By Author Test 2");
    }

    public void checkTestResult(Book[] realResult, Book[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
