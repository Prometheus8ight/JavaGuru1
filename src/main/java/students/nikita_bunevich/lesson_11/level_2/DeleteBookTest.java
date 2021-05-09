package students.nikita_bunevich.lesson_11.level_2;


class DeleteBookTest {
    public static void main(String[] args) {

        DeleteBookTest test = new DeleteBookTest();
        test.deleteBookTest1();
        test.deleteBookTest2();
        test.deleteBookTest3();
    }

    public void deleteBookTest1() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        boolean realResult = bookDatabase.delete(book1);
        checkTestResult(realResult, true, "Delete Book Test 1");
    }

    public void deleteBookTest2() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean realResult = bookDatabase.delete(book2);
        checkTestResult(realResult, true, "Delete Book Test 2");
    }

    public void deleteBookTest3() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean realResult = bookDatabase.delete(book3);
        checkTestResult(realResult, false, "Delete Book Test 3");
    }

    public void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
