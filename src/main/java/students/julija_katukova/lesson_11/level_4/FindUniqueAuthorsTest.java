package students.julija_katukova.lesson_11.level_4;

import java.util.HashSet;
import java.util.Set;

class FindUniqueAuthorsTest {
    public static void main(String[] args) {
        FindUniqueAuthorsTest findUniqueAuthorsTest = new FindUniqueAuthorsTest();
        findUniqueAuthorsTest.test1();
        findUniqueAuthorsTest.test2();

    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        Set<String> realResult = bookDatabase.findUniqueAuthors();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book1.getAuthor());
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
        Book book1 = new Book("Fyodor Dostoyevsky", "The Brothers Karamazov");
        Book book2 = new Book("Marcel Proust", " In Search of Lost Time");
        Book book3 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> realResult = bookDatabase.findUniqueAuthors();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book1.getAuthor());
        expectedResult.add(book2.getAuthor());
        check(realResult, expectedResult, "Test2");
    }

    private void check(Set<String> realResult, Set<String> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
