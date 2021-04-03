package students.deniss_jankovskis.lesson_10.level_6;

import java.util.Arrays;

class FindAllReadBooksTest {

    public static void main(String[] args) {

        FindAllReadBooksTest test = new FindAllReadBooksTest();
        test.findAllReadBooksTest1();
        test.findAllReadBooksTest2();
    }

    public void findAllReadBooksTest1() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.readBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        bookReaderImpl.addBook(book4);
        String[] realResult = bookReaderImpl.findAllReadBooks();
        checkTestResult(realResult, new String[]{"ABSALOM, ABSALOM!, [WILLIAM FAULKNER]"}, "Find All Read Books Test 2");
    }

    public void findAllReadBooksTest2() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        bookReaderImpl.readBook(book3);
        bookReaderImpl.addBook(book4);
        String[] realResult = bookReaderImpl.findAllReadBooks();
        checkTestResult(realResult, new String[]{"THE HOUSE OF MIRTH, [EDITH WHARTON]"}, "Find All Read Books Test 2");
    }

    public void checkTestResult(String[] realResult, String[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
