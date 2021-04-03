package students.alex_kalashnikov.lesson_10.level_5.task_17;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testFindByAuthor();
        victim.testFindByAuthor1();
        victim.testFindByAuthor2();
        victim.testFindByAuthor3();
        victim.testFindByAuthor4();
        victim.testFindByAuthor5();

    }

    void test(String[] expectedResult, String[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindByAuthor() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findByAuthor("Robert Martin"));
    }

    void testFindByAuthor1() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findByAuthor("Eric Freeman"));
    }

    void testFindByAuthor2() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]",
                "Dirty Code [Robert Martin]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.add(new Book("Dirty Code", "Robert Martin"));
        test(expectedResult, testRepository.findByAuthor("Robert Martin"));
    }

    void testFindByAuthor3() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Dirty Code [Robert Martin]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.add(new Book("Dirty Code", "Robert Martin"));
        testRepository.delete(new Book("Clean Code", "Robert Martin"));
        test(expectedResult, testRepository.findByAuthor("Robert Martin"));
    }

    void testFindByAuthor4() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findByAuthor("Lev Tolstoy"));
    }

    void testFindByAuthor5() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        test(expectedResult, testRepository.findByAuthor("Robert Martin"));
    }

}