package students.julija_katukova.lesson_11.level_2.task_6;

class CountBooksTest {

    public static void main(String[] args) {
        CountBooksTest saveBookTest = new CountBooksTest();
        saveBookTest.test1();
        saveBookTest.test2();
        saveBookTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        int realResult = bookDatabase.countAllBooks();
        check(realResult, 1, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("James Joyce", "Ulysses");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        int realResult = bookDatabase.countAllBooks();
        check(realResult, 2, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("James Joyce", "Ulysses");
        Book book3 = new Book("Miguel de Cervantes", "Don Quixote");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        int realResult = bookDatabase.countAllBooks();
        check(realResult, 3, "Test3");
    }

    private void check(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
