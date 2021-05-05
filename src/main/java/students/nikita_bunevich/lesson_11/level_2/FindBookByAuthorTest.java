package students.nikita_bunevich.lesson_11.level_2;


import java.util.ArrayList;
import java.util.List;

class FindBookByAuthorTest {

    public static void main(String[] args) {

        FindBookByAuthorTest test = new FindBookByAuthorTest();
        test.findBookByAuthorTest1();
        test.findBookByAuthorTest2();
        test.findBookByAuthorTest3();
    }

    public void findBookByAuthorTest1() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.findByAuthor("Steve");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        checkTestResult(realResult, expectedResult, "Find Book By Author Test 1");
    }

    public void findBookByAuthorTest2() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.findByAuthor("Herobrine");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book2);
        checkTestResult(realResult, expectedResult, "Find Book By Author Test 2");
    }

    public void findBookByAuthorTest3() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> realResult = bookDatabase.findByAuthor("Notch");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        checkTestResult(realResult, expectedResult, "Find Book By Author Test 3");
    }

    public void checkTestResult(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
