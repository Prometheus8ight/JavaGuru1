package students.nikita_bunevich.lesson_11.level_2;


import java.util.ArrayList;
import java.util.List;

class FindBookByTitleTest {
    public static void main(String[] args) {

        FindBookByTitleTest test = new FindBookByTitleTest();
        test.findBookByTitleTest1();
        test.findBookByTitleTest2();
        test.findBookByTitleTest3();
    }

    public void findBookByTitleTest1() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.findByTitle("How to kill Dragon");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        checkTestResult(realResult, expectedResult, "Find Book By Title Test 1");
    }

    private void findBookByTitleTest2() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.findByTitle("How to kill Steve");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        checkTestResult(realResult, expectedResult, "Find Book By Title Test 2");
    }

    private void findBookByTitleTest3() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.findByTitle("Minecraft");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        checkTestResult(realResult, expectedResult, "Find Book By Title Test 3");
    }

    public void checkTestResult(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
