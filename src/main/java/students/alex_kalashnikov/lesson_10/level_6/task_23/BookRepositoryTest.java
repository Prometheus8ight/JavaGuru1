package students.alex_kalashnikov.lesson_10.level_6.task_23;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testFindAllIsRead();
        victim.testFindAllIsRead1();
        victim.testFindAllIsRead2();
        victim.testFindAllIsRead3();
        victim.testFindAllIsRead4();
        victim.testFindAllIsRead5();
        victim.testFindAllIsRead6();
        victim.testFindAllIsRead7();
        victim.testFindAllIsRead8();

    }

    void test(String[] expectedResult, String[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFindAllIsRead() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsRead());
    }

    void testFindAllIsRead1() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        test(expectedResult, testRepository.findAllIsRead());
    }

    void testFindAllIsRead2() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsRead());
    }

    void testFindAllIsRead3() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsNotRead(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsRead());
    }

    void testFindAllIsRead4() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsRead());
    }

    void testFindAllIsRead5() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.markAsRead(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsRead());
    }

    void testFindAllIsRead6() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {"Clean Code [Robert Martin]", "Head First Java [Kathy Sierra]", "Head First Design Patterns [Eric Freeman]"};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsRead(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsRead());
    }

    void testFindAllIsRead7() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        testRepository.markAsNotRead(new Book("Clean Code", "Robert Martin"));
        testRepository.markAsRead(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsNotRead(new Book("Head First Java", "Kathy Sierra"));
        testRepository.markAsNotRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.findAllIsRead());
    }

    void testFindAllIsRead8() {
        BooksRepository testRepository = new BooksRepository();
        String[] expectedResult = {};
        test(expectedResult, testRepository.findAllIsRead());
    }

}