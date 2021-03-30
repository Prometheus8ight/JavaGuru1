package students.alex_kalashnikov.lesson_10.level_5.task_15;

import java.util.Arrays;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testDeleteBook();
        victim.testDeleteBook1();
        victim.testDeleteBook2();
        victim.testDeleteBook3();
        victim.testDeleteBook4();
        victim.testAddAndDeleteBooks();

    }

    void test(Book[] expectedResult, Book[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testDeleteBook() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.deleteBook(new Book("Head First Java", "Kathy Sierra"));
        test(expectedResult, testRepository.getRepository());
    }

    void testDeleteBook1() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.deleteBook(new Book("Clean Code", "Robert Martin"));
        test(expectedResult, testRepository.getRepository());
    }

    void testDeleteBook2() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Clean Code", "Robert Martin"),
                new Book("Head First Java", "Kathy Sierra"),
                new Book("Head First Design Patterns", "Eric Freeman")};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.deleteBook(new Book("Modern Java in Action", "Raoul-Gabriel Urma"));
        test(expectedResult, testRepository.getRepository());
    }

    void testDeleteBook3() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.deleteBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.deleteBook(new Book("Clean Code", "Robert Martin"));
        testRepository.deleteBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(expectedResult, testRepository.getRepository());
    }

    void testDeleteBook4() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.deleteBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(null, testRepository.getRepository());
    }

    void testAddAndDeleteBooks() {
        BooksRepository testRepository = new BooksRepository();
        Book[] expectedResult = {new Book("Head First Design Patterns", "Eric Freeman"),
                new Book("Clean Code", "Robert Martin")};
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.deleteBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.deleteBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.deleteBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.deleteBook(new Book("Modern Java in Action", "Raoul-Gabriel Urma"));
        testRepository.addBook(new Book("", "Kathy Sierra"));
        test(expectedResult, testRepository.getRepository());
    }

}