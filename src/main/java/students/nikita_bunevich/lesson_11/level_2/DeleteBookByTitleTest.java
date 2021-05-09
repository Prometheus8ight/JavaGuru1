package students.nikita_bunevich.lesson_11.level_2;


import java.util.ArrayList;
import java.util.List;

class DeleteBookByTitleTest {
    public static void main(String[] args) {

        DeleteBookByTitleTest test = new DeleteBookByTitleTest();
        test.deleteBookByTitleTest1();
        test.deleteBookByTitleTest2();
        test.deleteBookByTitleTest3();
    }

    public void deleteBookByTitleTest1() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.deleteByTitle("How to kill Dragon");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Title Test 1");
    }

    public void deleteBookByTitleTest2() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.deleteByTitle("How to kill Dragon");
        bookDatabase.deleteByTitle("How to kill Steve");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Title Test 2");
    }

    public void deleteBookByTitleTest3() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByTitle("How to kill Dragon");
        bookDatabase.deleteByTitle("How to kill Steve");
        bookDatabase.deleteByTitle("Minecraft");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Title Test 3");
    }

    public void checkTestResult(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
