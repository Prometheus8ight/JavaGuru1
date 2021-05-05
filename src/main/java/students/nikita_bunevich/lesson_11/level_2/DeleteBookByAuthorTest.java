package students.nikita_bunevich.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;

class DeleteBookByAuthorTest {

    public static void main(String[] args) {

        DeleteBookByAuthorTest test = new DeleteBookByAuthorTest();
        test.deleteBookByAuthorTest1();
        test.deleteBookByAuthorTest2();
        test.deleteBookByAuthorTest3();
    }

    public void deleteBookByAuthorTest1() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.deleteByAuthor("Steve");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Author Test 1");
    }

    public void deleteBookByAuthorTest2() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.deleteByAuthor("Steve");
        bookDatabase.deleteByAuthor("Herobrine");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Author Test 2");
    }

    public void deleteBookByAuthorTest3() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.deleteByAuthor("Steve");
        bookDatabase.deleteByAuthor("Herobrine");
        bookDatabase.deleteByAuthor("Notch");
        List<Book> realResult = bookDatabase.getBooks();
        List<Book> expectedResult = new ArrayList<>();
        checkTestResult(realResult, expectedResult, "Delete Book By Author Test 3");
    }

    public void checkTestResult(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
