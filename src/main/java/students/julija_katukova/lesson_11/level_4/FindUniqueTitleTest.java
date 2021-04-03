package students.julija_katukova.lesson_11.level_4;

import java.util.HashSet;
import java.util.Set;

class FindUniqueTitleTest {
    public static void main(String[] args) {
        FindUniqueTitleTest findUniqueTitleTest = new FindUniqueTitleTest();
        findUniqueTitleTest.test1();
        findUniqueTitleTest.test2();
    }

    private void test1() {
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        Set<String> realResult = bookDatabase.findUniqueTitles();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book1.getTitle());
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
        Set<String> realResult = bookDatabase.findUniqueTitles();
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add(book1.getTitle());
        expectedResult.add(book2.getTitle());
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
