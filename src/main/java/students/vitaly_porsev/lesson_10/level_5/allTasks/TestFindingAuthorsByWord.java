package students.vitaly_porsev.lesson_10.level_5.allTasks;

import java.util.Arrays;

public class TestFindingAuthorsByWord {

    public static void main(String[] args) {
        TestFindingAuthorsByWord method = new TestFindingAuthorsByWord();
        method.checkFindingByWord();
    }


    void checkFindingByWord() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque");
        bookReader.addBookToTheLibrary("To Kill a Mockingbird", "Leon Edel");
        bookReader.addBookToTheLibrary("Henry James", "Leo Tolstoy");
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        bookReader.addBookToTheLibrary("Harry Potter and the Philosopher’s Stone", "J.K. Rowling");
        bookReader.addBookToTheLibrary("My Life", "Leon Trotsky");
        bookReader.addBookToTheLibrary("The Lord of the Rings", "J.R.R. Tolkien");
        String[] expectedResult = {"To Kill a Mockingbird [Leon Edel]", "My Life [Leon Trotsky]" };
        check(expectedResult, bookReader.findBooksByWord("Leon"), "checkFindingByWord");
    }

    private void check(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
