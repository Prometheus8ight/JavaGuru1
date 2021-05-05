package students.nikita_bunevich.lesson_11.level_2;


class SaveBookTest {
    public static void main(String[] args) {

        SaveBookTest test = new SaveBookTest();
        test.saveBookTest1();
        test.saveBookTest2();
        test.saveBookTest3();
    }

    public void saveBookTest1() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        long realResult = bookDatabase.save(book1);
        checkTestResult(realResult, 1, "Save Book Test 1");
    }

    public void saveBookTest2() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        long realResult = bookDatabase.save(book2);
        checkTestResult(realResult, 2, "Save Book Test 2");
    }

    public void saveBookTest3() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        long realResult = bookDatabase.save(book3);
        checkTestResult(realResult, 3, "Save Book Test 3");
    }

    public void checkTestResult(long realResult, long expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
