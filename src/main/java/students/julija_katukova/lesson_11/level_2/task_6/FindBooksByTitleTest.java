package students.julija_katukova.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;

class FindBooksByTitleTest {

    public static void main(String[] args) {
        FindBooksByTitleTest findBooksByAuthorTest = new FindBooksByTitleTest();
        findBooksByAuthorTest.test1();
        findBooksByAuthorTest.test2();
        findBooksByAuthorTest.test3();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        List<Book> realResult = bookDatabase.findByTitle("In Search of Lost Time");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Caroline Kepnes", "You");
        Book book2 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book3 = new Book("Charles Benoit", "You");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.findByTitle("You");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book3);
        check(realResult, expectedResult, "Test2");
    }

    private void test3() {
        Book book1 = new Book("Fyodor Dostoyevsky", "The Brothers Karamazov");
        Book book2 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book3 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.findByTitle("You");
        List<Book> expectedResult = new ArrayList<>();
        check(realResult, expectedResult, "Test3");
    }

    private void check(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
