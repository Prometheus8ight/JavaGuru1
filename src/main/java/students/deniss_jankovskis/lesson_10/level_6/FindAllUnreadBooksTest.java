package students.deniss_jankovskis.lesson_10.level_6;

import java.util.Arrays;

class FindAllUnreadBooksTest {

    public static void main(String[] args) {

        FindAllUnreadBooksTest test = new FindAllUnreadBooksTest();
        test.findAllUnreadBooksTest1();
        test.findAllUnreadBooksTest2();
    }

    public void findAllUnreadBooksTest1() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.unreadBook(book2);
        bookReaderImpl.addBook(book3);
        bookReaderImpl.addBook(book4);
        String[] realResult = bookReaderImpl.findAllUnreadBooks();
        checkTestResult(realResult, new String[]{"A TIME TO KILL, [JOHN GRISHAM]"}, "Find All Unread Books Test 1");
    }

    public void findAllUnreadBooksTest2() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        bookReaderImpl.addBook(book4);
        bookReaderImpl.unreadBook(book4);
        String[] realResult = bookReaderImpl.findAllUnreadBooks();
        checkTestResult(realResult, new String[]{"EAST OF EDEN, [JOHN STEINBECK]"}, "Find All Unread Books Test 2");
    }

    public void checkTestResult(String[] realResult, String[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
