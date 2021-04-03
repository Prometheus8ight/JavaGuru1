package students.julija_katukova.lesson_11.level_2.task_6;

class DeleteBookTest2 {

    public static void main(String[] args) {
        DeleteBookTest2 saveBookTest = new DeleteBookTest2();
        saveBookTest.test1();
        saveBookTest.test2();
        saveBookTest.test3();
        saveBookTest.test4();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", " In Search of Lost Time");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        boolean realResult = bookDatabase.delete(book1);
        check(realResult, true, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("James Joyce", "Ulysses");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean realResult = bookDatabase.delete(book1);
        check(realResult, true, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("James Joyce", "Ulysses");
        Book book3 = new Book("Miguel de Cervantes", "Don Quixote");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean realResult = bookDatabase.delete(book2);
        check(realResult, true, "Test3");
    }

    private void test4() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("James Joyce", "Ulysses");
        Book book3 = new Book("Miguel de Cervantes", "Don Quixote");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean realResult = bookDatabase.delete(book3);
        check(realResult, false, "Test4");
    }

    private void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
