package students.julija_katukova.lesson_10.level_5;

class BookValidationTest {

    public static void main(String[] args) {
        BookValidationTest bookValidationTest = new BookValidationTest();
        bookValidationTest.test1();
        bookValidationTest.test2();
        bookValidationTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        boolean realResult = bookReaderImpl.addNewBook(book1);
        check(realResult, true, "Test1");
    }

    private void test2() {
        Book book1 = new Book(" ", "Jane Austen");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        boolean realResult = bookReaderImpl.addNewBook(book1);
        check(realResult, false, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book(null, null);
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.addNewBook(book1);
        bookReaderImpl.addNewBook(book2);
        boolean realResult = bookReaderImpl.addNewBook(book3);
        check(realResult, false, "Test3");

    }

    private void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
