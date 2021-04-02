package students.alex_kalashnikov.lesson_10.level_5.task_17;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testFindBooksByAuthor();
        victim.testFindBooksByAuthor1();
        victim.testFindBooksByAuthor2();
        victim.testFindBooksByAuthor3();
        victim.testFindBooksByAuthor4();
        victim.testFindBooksByAuthor5();

    }

    void test(String[] expectedResult, String[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindBooksByAuthor() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByAuthor("Robert Martin"));
    }

    void testFindBooksByAuthor1() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Design Patterns [Eric Freeman]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByAuthor("Eric Freeman"));
    }

    void testFindBooksByAuthor2() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]",
                "Dirty Code [Robert Martin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findBooksByAuthor("Robert Martin"));
    }

    void testFindBooksByAuthor3() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Dirty Code [Robert Martin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        testRepository.deleteBook(new Book("Clean Code", "Robert Martin"));
        test(expectedResult, testRepository.findBooksByAuthor("Robert Martin"));
    }

    void testFindBooksByAuthor4() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByAuthor("Lev Tolstoy"));
    }

    void testFindBooksByAuthor5() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        test(expectedResult, testRepository.findBooksByAuthor("Robert Martin"));
    }

}