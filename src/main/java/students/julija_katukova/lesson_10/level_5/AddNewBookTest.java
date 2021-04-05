package students.julija_katukova.lesson_10.level_5;

class AddNewBookTest {

    public static void main(String[] args) {
        AddNewBookTest addNewBookTest = new AddNewBookTest();
        addNewBookTest.test1();
        addNewBookTest.test2();
        addNewBookTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        boolean realResult = bookReaderImpl.add(book1);
        check(realResult, true, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.add(book1);
        boolean realResult = bookReaderImpl.add(book2);
        check(realResult, true, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        boolean realResult = bookReaderImpl.add(book3);
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
