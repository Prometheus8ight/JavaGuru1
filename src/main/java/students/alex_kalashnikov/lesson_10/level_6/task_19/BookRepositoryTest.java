package students.alex_kalashnikov.lesson_10.level_6.task_19;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testFindByName();
        victim.testFindByName1();
        victim.testFindByName2();
        victim.testFindByName3();
        victim.testFindByName4();
        victim.testFindByName5();

    }

    void test(String[] expectedResult, String[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindByName() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findByName("Clean Code"));
    }

    void testFindByName1() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findByName("Head fIRst design patterns"));
    }

    void testFindByName2() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findByName("Dirty Code"));
    }

    void testFindByName3() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        test(expectedResult, testRepository.findByName("Dirty Code"));
    }

    void testFindByName4() {
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
        test(expectedResult, testRepository.findByName("dirty code"));
    }

    void testFindByName5() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Clean Code [Vasily Pupkin]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.add(new Book("Clean Code", "Vasily Pupkin"));
        test(expectedResult, testRepository.findByName("Clean Code"));
    }

}