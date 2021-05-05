package students.nikita_bunevich.lesson_11.level_2;


public class DeleteBookIdTest {
    public static void main(String[] args) {

        DeleteBookIdTest test = new DeleteBookIdTest();
        test.deleteBookIdTest1();
        test.deleteBookIdTest2();
        test.deleteBookIdTest3();
    }

    public void deleteBookIdTest1() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        boolean realResult = bookDatabase.delete(1);
        checkTestResult(realResult, true, "Delete Book ID Test 1");
    }

    public void deleteBookIdTest2() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean realResult = bookDatabase.delete(2);
        checkTestResult(realResult, true, "Delete Book ID Test 2");
    }

    public void deleteBookIdTest3() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        boolean realResult = bookDatabase.delete(3);
        checkTestResult(realResult, false, "Delete Book ID Test 3");
    }

    public void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
