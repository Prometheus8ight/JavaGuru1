package students.alex_kalashnikov.lesson_10.level_5.task_16;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testFindAll();
        victim.testFindAll1();
        victim.testFindAll2();
        victim.testFindAll3();
        victim.testFindAll4();

    }

    void test(String[] expectedResult, String[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindAll() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]",
                "Head First Java [Kathy Sierra]",
                "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAll());
    }

    void testFindAll1() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Java [Kathy Sierra]",
                "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.delete(new Book("Clean Code", "Robert Martin"));
        test(expectedResult, testRepository.findAll());
    }

    void testFindAll2() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]",
                "Head First Java [Kathy Sierra]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.delete(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAll());
    }

    void testFindAll3() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.delete(new Book("Head First Java", "Kathy Sierra"));
        testRepository.delete(new Book("Clean Code", "Robert Martin"));
        testRepository.delete(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAll());
    }

    void testFindAll4() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        test(expectedResult, testRepository.findAll());
    }

}