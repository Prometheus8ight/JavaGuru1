package students.deniss_jankovskis.lesson_10.level_5;

class AddBookTest {

    public static void main(String[] args) {

        AddBookTest test = new AddBookTest();
        test.addBookTest1();
        test.addBookTest2();
        test.addBookTest3();
        test.addBookTest4();
    }

    public void addBookTest1() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        boolean realResult = bookReaderImpl.addBook(book1);
        checkTestResult(realResult, true, "Add Book Test 1");
    }

    public void addBookTest2() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        boolean realResult = bookReaderImpl.addBook(book2);
        checkTestResult(realResult, true, "Add Book Test 2");
    }

    public void addBookTest3() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        boolean realResult = bookReaderImpl.addBook(book3);
        checkTestResult(realResult, true, "Add Book Test 3");
    }

    public void addBookTest4() {
        Book book1 = new Book("ABSALOM, ABSALOM!", "WILLIAM FAULKNER");
        Book book2 = new Book("A TIME TO KILL", "JOHN GRISHAM");
        Book book3 = new Book("THE HOUSE OF MIRTH", "EDITH WHARTON");
        Book book4 = new Book("EAST OF EDEN", "JOHN STEINBECK");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addBook(book1);
        bookReaderImpl.addBook(book2);
        bookReaderImpl.addBook(book3);
        bookReaderImpl.addBook(book4);
        boolean realResult = bookReaderImpl.addBook(book4);
        checkTestResult(realResult, false, "Add Book Test 4");
    }

    public void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
