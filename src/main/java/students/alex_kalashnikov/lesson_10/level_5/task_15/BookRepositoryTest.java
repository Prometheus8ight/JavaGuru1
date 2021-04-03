package students.alex_kalashnikov.lesson_10.level_5.task_15;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testDelete();
        victim.testDelete1();
        victim.testDelete2();
        victim.testDelete3();
        victim.testDelete4();
        victim.testAddAndDeletes();

    }

    void test(Book[] expectedResult, Book[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testDelete() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.delete(new Book("Head First Java", "Kathy Sierra"));
        test(expectedResult, testRepository.getRepository());
    }

    void testDelete1() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.delete(new Book("Clean Code", "Robert Martin"));
        test(expectedResult, testRepository.getRepository());
    }

    void testDelete2() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.delete(new Book("Modern Java in Action", "Raoul-Gabriel Urma"));
        test(expectedResult, testRepository.getRepository());
    }

    void testDelete3() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.delete(new Book("Head First Java", "Kathy Sierra"));
        testRepository.delete(new Book("Clean Code", "Robert Martin"));
        testRepository.delete(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }

    void testDelete4() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {};
        testRepository.delete(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }

    void testAddAndDeletes() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Head First Design Patterns", "Eric Freeman"),
                new Book("Clean Code", "Robert Martin")};
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.delete(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.delete(new Book("Head First Java", "Kathy Sierra"));
        testRepository.delete(new Book("Head First Java", "Kathy Sierra"));
        testRepository.delete(new Book("Modern Java in Action", "Raoul-Gabriel Urma"));
        testRepository.add(new Book("", "Kathy Sierra"));
        test(expectedResult, testRepository.getRepository());
    }

}