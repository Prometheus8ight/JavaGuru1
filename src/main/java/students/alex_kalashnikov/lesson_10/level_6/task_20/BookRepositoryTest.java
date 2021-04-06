package students.alex_kalashnikov.lesson_10.level_6.task_20;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testFindByNameLetters();
        victim.testFindByNameLetters1();
        victim.testFindByNameLetters2();
        victim.testFindByNameLetters3();
        victim.testFindByNameLetters4();
        victim.testFindByNameLetters5();
        victim.testFindByNameLetters6();
        victim.testFindByNameLetters7();
        victim.testFindByNameLetters8();

    }

    void test(String[] expectedResult, String[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindByNameLetters() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findByNameLetters("Clean Code"));
    }

    void testFindByNameLetters1() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findByNameLetters("Head first design PATterns"));
    }

    void testFindByNameLetters2() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Java [Kathy Sierra]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.add(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findByNameLetters("head first"));
    }

    void testFindByNameLetters3() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findByNameLetters("Clean "));
    }

    void testFindByNameLetters4() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Java [Kathy Sierra]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.add(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findByNameLetters("Head"));
    }

    void testFindByNameLetters5() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.add(new Book("Dirty Code", "Robert Martin"));
        testRepository.delete(new Book("Head First Java", "Kathy Sierra"));
        test(expectedResult, testRepository.findByNameLetters("Head First Design"));
    }

    void testFindByNameLetters6() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        test(expectedResult, testRepository.findByNameLetters("head first"));
    }

    void testFindByNameLetters7() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.add(new Book("Dirty Code", "Robert Martin"));
        testRepository.delete(new Book("Clean Code", "Robert Martin"));
        testRepository.delete(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.delete(new Book("Head First Java", "Kathy Sierra"));
        testRepository.delete(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findByNameLetters("Head"));
    }

    void testFindByNameLetters8() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.add(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findByNameLetters("Head First A"));
    }

}