package students.nikita_bunevich.lesson_11.level_2;


import java.util.Optional;

class FindBookByIdTest {
    public static void main(String[] args) {

        FindBookByIdTest test = new FindBookByIdTest();
        test.findBookByIdTest1();
        test.findBookByIdTest2();
        test.findBookByIdTest3();
    }

    public void findBookByIdTest1() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        Optional<Book> realResult = bookDatabase.findById(1);
        checkTestResult(realResult, Optional.of(book1), "Find Book By ID Test 1");
    }

    public void findBookByIdTest2() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        Optional<Book> realResult = bookDatabase.findById(2);
        checkTestResult(realResult, Optional.of(book2), "Find Book By ID Test 2");

    }

    public void findBookByIdTest3() {
        Book book1 = new Book("Steve", "How to kill Dragon");
        Book book2 = new Book("Herobrine", "How to kill Steve");
        Book book3 = new Book("Notch", "Minecraft");
        BookDataBaseImpl bookDatabase = new BookDataBaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Optional<Book> realResult = bookDatabase.findById(3);
        checkTestResult(realResult, Optional.of(book3), "Find Book By ID Test 3");
    }

    public void checkTestResult(Optional<Book> realResult, Optional<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
