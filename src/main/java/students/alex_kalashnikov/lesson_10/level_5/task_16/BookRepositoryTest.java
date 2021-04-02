package students.alex_kalashnikov.lesson_10.level_5.task_16;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testFindAllBooks();
        victim.testFindAllBooks1();
        victim.testFindAllBooks2();
        victim.testFindAllBooks3();
        victim.testFindAllBooks4();

    }

    void test(String[] expectedResult, String[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindAllBooks() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]",
                "Head First Java [Kathy Sierra]",
                "Head First Design Patterns [Eric Freeman]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllBooks());
    }

    void testFindAllBooks1() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Java [Kathy Sierra]",
                "Head First Design Patterns [Eric Freeman]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.deleteBook(new Book("Clean Code", "Robert Martin"));
        test(expectedResult, testRepository.findAllBooks());
    }

    void testFindAllBooks2() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]",
                "Head First Java [Kathy Sierra]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.deleteBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllBooks());
    }

    void testFindAllBooks3() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.deleteBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.deleteBook(new Book("Clean Code", "Robert Martin"));
        testRepository.deleteBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllBooks());
    }

    void testFindAllBooks4() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        test(expectedResult, testRepository.findAllBooks());
    }

}