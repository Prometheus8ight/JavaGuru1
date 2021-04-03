package students.alex_kalashnikov.lesson_10.level_6.task_19;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testFindBookByName();
        victim.testFindBookByName1();
        victim.testFindBookByName2();
        victim.testFindBookByName3();
        victim.testFindBookByName4();
        victim.testFindBookByName5();

    }

    void test(String[] expectedResult, String[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindBookByName() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByName("Clean Code"));
    }

    void testFindBookByName1() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Design Patterns [Eric Freeman]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByName("Head fIRst design patterns"));
    }

    void testFindBookByName2() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByName("Dirty Code"));
    }

    void testFindBookByName3() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        test(expectedResult, testRepository.findBooksByName("Dirty Code"));
    }

    void testFindBookByName4() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        testRepository.deleteBook(new Book("Clean Code", "Robert Martin"));
        testRepository.deleteBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.deleteBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.deleteBook(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findBooksByName("dirty code"));
    }

    void testFindBookByName5() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Clean Code [Vasily Pupkin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Clean Code", "Vasily Pupkin"));
        test(expectedResult, testRepository.findBooksByName("Clean Code"));
    }

}