package students.vitaly_porsev.lesson_10.level_6.allTasks;

import java.util.Arrays;

class TestFindingByTitle {

    public static void main(String[] args) {
        TestFindingByTitle method = new TestFindingByTitle();
        method.checkFindingByTitle();

    }

    void checkFindingByTitle() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque");
        bookReader.addBookToTheLibrary("To Kill a Mockingbird", "Harper Lee");
        bookReader.addBookToTheLibrary("War and Peace", "Leo Tolstoy");
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        bookReader.addBookToTheLibrary("Harry Potter and the Philosopher’s Stone", "J.K. Rowling");
        bookReader.addBookToTheLibrary("The Lord of the Rings", "J.R.R. Tolkien");
        String[] expectedResult = {"All Quiet on the Western Front [Erich Maria Remarque]"};
        check(expectedResult, bookReader.findBooksByEqualTitle("All Quiet on the Western Front"), "checkFindingByTitle");
    }

    private void check(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
