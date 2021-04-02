package students.alex_kalashnikov.lesson_10.level_5.task_18;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testFindBooksByLetters();
        victim.testFindBooksByLetters1();
        victim.testFindBooksByLetters2();
        victim.testFindBooksByLetters3();
        victim.testFindBooksByLetters4();
        victim.testFindBooksByLetters5();
        victim.testFindBooksByLetters6();
        victim.testFindBooksByLetters7();
        victim.testFindBooksByLetters8();

    }

    void test(String[] expectedResult, String[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindBooksByLetters() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByLetters("Robert Martin"));
    }

    void testFindBooksByLetters1() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Design Patterns [Eric Freeman]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByLetters("eric freeman"));
    }

    void testFindBooksByLetters2() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Dirty Code [Robert Martin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findBooksByLetters("Robert Martin"));
    }

    void testFindBooksByLetters3() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findBooksByLetters("Robert "));
    }

    void testFindBooksByLetters4() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Dirty Code [Robert Martin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findBooksByLetters("Rob"));
    }

    void testFindBooksByLetters5() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Dirty Code [Robert Martin]"};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        testRepository.deleteBook(new Book("Clean Code", "Robert Martin"));
        test(expectedResult, testRepository.findBooksByLetters("Robert Ma"));
    }

    void testFindBooksByLetters6() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        test(expectedResult, testRepository.findBooksByAuthor("Robert Martin"));
    }

    void testFindBooksByLetters7() {
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
        test(expectedResult, testRepository.findBooksByLetters("Robert Ma"));
    }

    void testFindBooksByLetters8() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findBooksByLetters("Kathy Sierra 1"));
    }

}