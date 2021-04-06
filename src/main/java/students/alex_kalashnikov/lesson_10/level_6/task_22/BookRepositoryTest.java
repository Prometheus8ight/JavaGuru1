package students.alex_kalashnikov.lesson_10.level_6.task_22;

class BookRepositoryTest {

    public static void main(String[] args) {

        BookRepositoryTest victim = new BookRepositoryTest();
        victim.testMarkAsNotRead();
        victim.testMarkAsNotRead1();
        victim.testMarkAsNotRead2();
        victim.testMarkAsNotRead3();
        victim.testMarkAsNotRead4();
        victim.testMarkAsNotRead5();
        victim.testMarkAsNotRead6();
        victim.testMarkAsNotRead7();
        victim.testMarkAsNotRead8();
        victim.testMarkAsNotRead9();

    }

    void test(boolean expectedResult, boolean realResult) {
        if (expectedResult == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testMarkAsNotRead() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(true, testRepository.markAsNotRead(new Book("Clean Code", "Robert Martin")));
    }

    void testMarkAsNotRead1() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsNotRead(new Book("Clean Code", "Robert Martin"));
        test(false, testRepository.getRepository()[0].isBookIsRead());
    }

    void testMarkAsNotRead2() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(true, testRepository.markAsNotRead(new Book("Head First Design Patterns", "Eric Freeman")));
    }

    void testMarkAsNotRead3() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsNotRead(new Book("Head First Design Patterns", "Eric Freeman"));
        test(false, testRepository.getRepository()[2].isBookIsRead());
    }

    void testMarkAsNotRead4() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(false, testRepository.markAsNotRead(new Book("Dirty Code", "Robert Martin")));
    }

    void testMarkAsNotRead5() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        test(false, testRepository.getRepository()[1].isBookIsRead());
    }

    void testMarkAsNotRead6() {
        BooksRepository testRepository = new BooksRepository();
        test(false, testRepository.markAsNotRead(new Book("Clean Code", "Robert Martin")));
    }

    void testMarkAsNotRead7() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.add(new Book("Dirty Code", "Robert Martin"));
        testRepository.delete(new Book("Clean Code", "Robert Martin"));
        testRepository.delete(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.delete(new Book("Head First Java", "Kathy Sierra"));
        testRepository.delete(new Book("Dirty Code", "Robert Martin"));
        test(false, testRepository.markAsNotRead(new Book("Dirty Code", "Robert Martin")));
    }

    void testMarkAsNotRead8() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        test(true, testRepository.markAsNotRead(new Book("Clean Code", "Robert Martin")));
    }

    void testMarkAsNotRead9() {
        BooksRepository testRepository = new BooksRepository();
        testRepository.add(new Book("Clean Code", "Robert Martin"));
        testRepository.markAsRead(new Book("Clean Code", "Robert Martin"));
        testRepository.add(new Book("Head First Java", "Kathy Sierra"));
        testRepository.add(new Book("Head First Design Patterns", "Eric Freeman"));
        testRepository.markAsNotRead(new Book("Clean Code", "Robert Martin"));
        test(false, testRepository.getRepository()[0].isBookIsRead());
    }

}