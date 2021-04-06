package students.deniss_jankovskis.lesson_11.level_2;

class CountAllBooksTest {

    public static void main(String[] args) {

        CountAllBooksTest test = new CountAllBooksTest();
        test.countAllBooksTest1();
        test.countAllBooksTest2();
        test.countAllBooksTest3();
    }

    public void countAllBooksTest1() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        int realResult = bookDatabase.countAllBooks();
        checkTestResult(realResult, 1, "Count All Books Test 1");
    }

    public void countAllBooksTest2() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        int realResult = bookDatabase.countAllBooks();
        checkTestResult(realResult, 2, "Count All Books Test 2");
    }

    public void countAllBooksTest3() {
        Book book1 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book2 = new Book("Leo Tolstoy", "War and Peace");
        Book book3 = new Book("Gustave Flaubert", "Madame Bovary");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        int realResult = bookDatabase.countAllBooks();
        checkTestResult(realResult, 3, "Count All Books Test 3");
    }

    public void checkTestResult(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
