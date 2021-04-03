package students.alex_kalashnikov.lesson_10.level_5.task_13;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testAdd();
        victim.testAddSameBooks();
        victim.testAddSameBooks1();

    }

    void test(Book[] expectedResult, Book[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testAdd() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }

    void testAddSameBooks() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }

    void testAddSameBooks1() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }

}