package students.deniss_jankovskis.lesson_11.level_2;

class DeleteBookIdTest {

    public static void main(String[] args) {

        DeleteBookIdTest test = new DeleteBookIdTest();
        test.deleteBookIdTest1();
        test.deleteBookIdTest2();
        test.deleteBookIdTest3();
    }

    public void deleteBookIdTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        boolean realResult = bookDatabase.delete(1L);
        checkTestResult(realResult, true, "Delete Book ID Test 1");
    }

    public void deleteBookIdTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean realResult = bookDatabase.delete(2L);
        checkTestResult(realResult, true, "Delete Book ID Test 2");
    }

    public void deleteBookIdTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean realResult = bookDatabase.delete(3L);
        checkTestResult(realResult, false, "Delete Book ID Test 3");
    }

    public void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
