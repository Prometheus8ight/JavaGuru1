package students.julija_katukova.lesson_10.level_6;

class WasReadTest {
    public static void main(String[] args) {
        WasReadTest wasReadTest = new WasReadTest();
        wasReadTest.test1();
        wasReadTest.test2();
        wasReadTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        bookReaderImpl.add(book3);
        boolean realResult = bookReaderImpl.wasRead(book2);
        check(realResult, true, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        bookReaderImpl.add(book3);
        boolean realResult = bookReaderImpl.wasRead(book1);
        check(realResult, true, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Pride and Prejudice", "Jane Austen");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Crime and Punishment", "Fyodor Dostoyevsky");
        BookReaderImpl bookReaderImpl = new BookReaderImpl();
        bookReaderImpl.add(book1);
        bookReaderImpl.add(book2);
        boolean realResult = bookReaderImpl.wasRead(book3);
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
