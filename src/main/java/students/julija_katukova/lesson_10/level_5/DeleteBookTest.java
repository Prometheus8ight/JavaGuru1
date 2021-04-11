package students.julija_katukova.lesson_10.level_5;

class DeleteBookTest {

    BookValidator bookValidator = new BookValidator();

    public static void main(String[] args) {
        DeleteBookTest deleteBookTest = new DeleteBookTest();
        deleteBookTest.test1();
        deleteBookTest.test2();
        deleteBookTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        BookReaderImpl bookReaderImpl = new BookReaderImpl(bookValidator);
        bookReaderImpl.add(book1);
        boolean realResult = bookReaderImpl.delete(book1);
        check(realResult, true, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl(bookValidator);
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        bookReaderImpl.add(book3);
        boolean realResult = bookReaderImpl.delete(book2);
        check(realResult, true, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl(bookValidator);
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book3);
        boolean realResult = bookReaderImpl.delete(book2);
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
