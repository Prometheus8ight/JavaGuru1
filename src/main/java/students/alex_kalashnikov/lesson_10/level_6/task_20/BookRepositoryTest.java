package students.alex_kalashnikov.lesson_10.level_6.task_20;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testFindBooksByNameLetters();
        victim.testFindBooksByNameLetters1();
        victim.testFindBooksByNameLetters2();
        victim.testFindBooksByNameLetters3();
        victim.testFindBooksByNameLetters4();
        victim.testFindBooksByNameLetters5();
        victim.testFindBooksByNameLetters6();
        victim.testFindBooksByNameLetters7();
        victim.testFindBooksByNameLetters8();

    }

    void test(String[] expectedResult, String[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindBooksByNameLetters() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByNameLetters("Clean Code"));
        System.out.println(Arrays.toString(expectedResult));
        System.out.println(Arrays.toString(testRepository.findBooksByNameLetters("Clean Code")));
    }

    void testFindBooksByNameLetters1() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Design Patterns [Eric Freeman]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByNameLetters("Head first design PATterns"));
    }

    void testFindBooksByNameLetters2() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Java [Kathy Sierra]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findBooksByNameLetters("head first"));
    }

    void testFindBooksByNameLetters3() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByNameLetters("Clean "));
    }

    void testFindBooksByNameLetters4() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Java [Kathy Sierra]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findBooksByNameLetters("Head"));
    }

    void testFindBooksByNameLetters5() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Design Patterns [Eric Freeman]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        testRepository.deleteBook(new Book("Head First Java", "Kathy Sierra"));
        test(expectedResult, testRepository.findBooksByNameLetters("Head First Design"));
    }

    void testFindBooksByNameLetters6() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        test(expectedResult, testRepository.findBooksByAuthor("head first"));
    }

    void testFindBooksByNameLetters7() {
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
        test(expectedResult, testRepository.findBooksByNameLetters("Head"));
    }

    void testFindBooksByNameLetters8() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findBooksByNameLetters("Head First A"));
    }

}