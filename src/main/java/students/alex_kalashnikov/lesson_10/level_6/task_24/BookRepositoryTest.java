package students.alex_kalashnikov.lesson_10.level_6.task_24;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testFindAllIsNotRead();
        victim.testFindAllIsNotRead1();
        victim.testFindAllIsNotRead2();
        victim.testFindAllIsNotRead3();
        victim.testFindAllIsNotRead4();
        victim.testFindAllIsNotRead5();
        victim.testFindAllIsNotRead6();
        victim.testFindAllIsNotRead7();
        victim.testFindAllIsNotRead8();

    }

    void test(String[] expectedResult, String[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindAllIsNotRead() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Head First Java [Kathy Sierra]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsNotRead());
    }

    void testFindAllIsNotRead1() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Java [Kathy Sierra]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        test(expectedResult, testRepository.findAllIsNotRead());
    }

    void testFindAllIsNotRead2() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Head First Java [Kathy Sierra]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsNotRead());
    }

    void testFindAllIsNotRead3() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsRead(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsNotRead());
    }

    void testFindAllIsNotRead4() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Head First Java [Kathy Sierra]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsNotRead(new Book("Clean Code", "Robert Martin"));
        test(expectedResult, testRepository.findAllIsNotRead());
    }

    void testFindAllIsNotRead5() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Java [Kathy Sierra]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.markAsRead(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsNotRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsNotRead());
    }

    void testFindAllIsNotRead6() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Head First Java [Kathy Sierra]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.markAsNotRead(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsNotRead(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsNotRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsNotRead());
    }

    void testFindAllIsNotRead7() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Head First Java [Kathy Sierra]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        testRepository.markAsNotRead(new Book("Clean Code", "Robert Martin"));
        testRepository.markAsRead(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsNotRead(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsNotRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsNotRead());
    }

    void testFindAllIsNotRead8() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        test(expectedResult, testRepository.findAllIsNotRead());
    }

}