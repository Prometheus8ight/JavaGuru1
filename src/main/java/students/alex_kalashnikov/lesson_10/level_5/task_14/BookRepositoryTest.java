package students.alex_kalashnikov.lesson_10.level_5.task_14;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testAddBook();
        victim.testAddBookWithoutName();
        victim.testAddBookWithoutAuthor();
        victim.testAddBookWithoutNameAndAuthor();
        victim.testCheckParameters();
        victim.testCheckParameters1();
        victim.testCheckParameters2();
        victim.testCheckParameters3();

    }

    void test(Book[] expectedResult, Book[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testContains(boolean realResult, boolean expectedResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testAddBook() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }

    void testAddBookWithoutName() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("", "Raoul-Gabriel Urma"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }

    void testAddBookWithoutAuthor() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Modern Java in Action", ""));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }

    void testAddBookWithoutNameAndAuthor() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("", ""));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }

    void testCheckParameters() {
        BooksRepository testRepository = new BooksRepository();
        Book book = new Book("Clean Code", "");
        testContains(testRepository.checkParameters(book), false);
    }

    void testCheckParameters1() {
        BooksRepository testRepository = new BooksRepository();
        Book book = new Book("", "Robert Martin");
        testContains(testRepository.checkParameters(book), false);
    }

    void testCheckParameters2() {
        BooksRepository testRepository = new BooksRepository();
        Book book = new Book("", "");
        testContains(testRepository.checkParameters(book), false);
    }

    void testCheckParameters3() {
        BooksRepository testRepository = new BooksRepository();
        Book book = new Book("Clean Code", "Robert Martin");
        testContains(testRepository.checkParameters(book), true);
    }

}