package students.deniss_jankovskis.lesson_10.level_5;

class DeleteBookTest {

    public static void main(String[] args) {

        DeleteBookTest test = new DeleteBookTest();
        test.deleteBookTest1();
        test.deleteBookTest2();
        test.deleteBookTest3();
        test.deleteBookTest4();
    }

    public void deleteBookTest1() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        boolean realResult = bookReaderImpl.deleteBook(book1);
        checkTestResult(realResult, true, "Delete Book Test 1");
    }

    public void deleteBookTest2() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        boolean realResult = bookReaderImpl.deleteBook(book2);
        checkTestResult(realResult, true, "Delete Book Test 2");
    }

    public void deleteBookTest3() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        boolean realResult = bookReaderImpl.deleteBook(book3);
        checkTestResult(realResult, true, "Delete Book Test 3");
    }

    public void deleteBookTest4() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        boolean realResult = bookReaderImpl.deleteBook(book4);
        checkTestResult(realResult, false, "Delete Book Test 4");
    }

    public void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
