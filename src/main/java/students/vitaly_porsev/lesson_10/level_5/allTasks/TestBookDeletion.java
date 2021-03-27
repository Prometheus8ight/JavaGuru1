package students.vitaly_porsev.lesson_10.level_5.allTasks;

import java.util.Arrays;

public class TestBookDeletion {
    public static void main(String[] args) {
        TestBookDeletion method = new TestBookDeletion();
        method.CheckBookDeletion();
        method.checkBookDeletionTrue();
        method.checkBookDeletionFalse();
    }

    void CheckBookDeletion() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque");
        bookReader.addBookToTheLibrary("To Kill a Mockingbird", "Harper Lee");
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        bookReader.addBookToTheLibrary("Harry Potter and the Philosopher’s Stone", "J.K. Rowling");
        bookReader.addBookToTheLibrary("The Lord of the Rings", "J.R.R. Tolkien");
        String[] expectedResult = {"All Quiet on the Western Front [Erich Maria Remarque]", "To Kill a Mockingbird [Harper Lee]",
                "Harry Potter and the Philosopher’s Stone [J.K. Rowling]", "The Lord of the Rings [J.R.R. Tolkien]" };
        bookReader.deleteBookByTitle("1984");
        check(expectedResult, bookReader.printAllBooks(), "CheckBookDeletion");
    }

    void checkBookDeletionTrue() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque");
        bookReader.addBookToTheLibrary("To Kill a Mockingbird", "Harper Lee");
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        bookReader.addBookToTheLibrary("Harry Potter and the Philosopher’s Stone", "J.K. Rowling");
        bookReader.addBookToTheLibrary("The Lord of the Rings", "J.R.R. Tolkien");
        checkTrue(true, bookReader.deleteBookByTitle("1984"), "checkBookDeletionTrue");
    }

    void checkBookDeletionFalse() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque");
        bookReader.addBookToTheLibrary("To Kill a Mockingbird", "Harper Lee");
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        bookReader.addBookToTheLibrary("Harry Potter and the Philosopher’s Stone", "J.K. Rowling");
        bookReader.addBookToTheLibrary("The Lord of the Rings", "J.R.R. Tolkien");
        checkFalse(false, bookReader.deleteBookByTitle("In Search of Lost Time"), "checkBookDeletionFalse");
    }

    private void check(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    private void checkTrue(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    private void checkFalse(boolean expectedResult, boolean realResult, String testName) {
        if (!expectedResult == !realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
