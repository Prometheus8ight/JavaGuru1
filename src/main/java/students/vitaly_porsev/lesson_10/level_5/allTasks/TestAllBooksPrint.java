package students.vitaly_porsev.lesson_10.level_5.allTasks;

import java.util.Arrays;

public class TestAllBooksPrint {

    public static void main(String[] args) {
        TestAllBooksPrint method = new TestAllBooksPrint();
        method.checkBooksList();
    }

    void checkBooksList() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque");
        bookReader.addBookToTheLibrary("To Kill a Mockingbird", "Harper Lee");
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        bookReader.addBookToTheLibrary("Harry Potter and the Philosopher’s Stone", "J.K. Rowling");
        bookReader.addBookToTheLibrary("The Lord of the Rings", "J.R.R. Tolkien");
        String[] expectedResult = {"All Quiet on the Western Front [Erich Maria Remarque]", "To Kill a Mockingbird [Harper Lee]",
                "1984 [George Orwell]", "Harry Potter and the Philosopher’s Stone [J.K. Rowling]", "The Lord of the Rings [J.R.R. Tolkien]" };
        check(expectedResult, bookReader.printAllBooks(), "checkBooksList");
    }

    private void check(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
