package students.alex_kalashnikov.lesson_10.level_6.task_21;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testMarkAsRead();
        victim.testMarkAsRead1();
        victim.testMarkAsRead2();
        victim.testMarkAsRead3();
        victim.testMarkAsRead4();
        victim.testMarkAsRead5();
        victim.testMarkAsRead6();
        victim.testMarkAsRead7();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testMarkAsRead() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(true, testRepository.markAsRead(new Book("Clean Code", "Robert Martin")));
    }

    void testMarkAsRead1() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        test(true, testRepository.getRepository()[0].isBookIsRead());
    }

    void testMarkAsRead2() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(true, testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman")));
    }

    void testMarkAsRead3() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(true, testRepository.getRepository()[2].isBookIsRead());
    }

    void testMarkAsRead4() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(false, testRepository.markAsRead(new Book("Dirty Code", "Robert Martin")));
    }

    void testMarkAsRead5() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        test(false, testRepository.getRepository()[1].isBookIsRead());
    }

    void testMarkAsRead6() {
        BooksRepository testRepository = new BooksRepository();
        test(false, testRepository.markAsRead(new Book("Clean Code", "Robert Martin")));
    }

    void testMarkAsRead7() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.addBook(new Book("Clean Code", "Robert Martin"));
        testRepository.addBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.addBook(new Book("Dirty Code", "Robert Martin"));
        testRepository.deleteBook(new Book("Clean Code", "Robert Martin"));
        testRepository.deleteBook(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.deleteBook(new Book("Head First Java", "Kathy Sierra"));
        testRepository.deleteBook(new Book("Dirty Code", "Robert Martin"));
        test(false, testRepository.markAsRead(new Book("Dirty Code", "Robert Martin")));
    }

}