package students.deniss_jankovskis.lesson_11.level_2;

class SaveBookTest {

    public static void main(String[] args) {

        SaveBookTest test = new SaveBookTest();
        test.saveBookTest1();
        test.saveBookTest2();
        test.saveBookTest3();
    }

    public void saveBookTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        long realResult = bookDatabase.save(book1);
        checkTestResult(realResult, 1, "Save Book Test 1");
    }

    public void saveBookTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        long realResult = bookDatabase.save(book2);
        checkTestResult(realResult, 2, "Save Book Test 2");
    }

    public void saveBookTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        long realResult = bookDatabase.save(book3);
        checkTestResult(realResult, 3, "Save Book Test 3");
    }

    public void checkTestResult(long realResult, long expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
