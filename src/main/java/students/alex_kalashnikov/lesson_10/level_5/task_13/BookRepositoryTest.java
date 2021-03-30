package students.alex_kalashnikov.lesson_10.level_5.task_13;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testAddBook();
        victim.testAddSameBooks();
        victim.testAddSameBooks1();
        victim.testCheckContains();
        victim.testCheckContains1();

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

    void testAddSameBooks() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }

    void testAddSameBooks1() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }


    void testCheckContains() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        Book book = new Book("Clean Code", "Robert Martin");
        testContains(testRepository.checkContains(book), false);
    }

    void testCheckContains1() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        Book book = new Book("Modern Java in Action", "Raoul-Gabriel Urma");
        testContains(testRepository.checkContains(book), true);
    }

}