package students.vitaly_porsev.lesson_10.level_6.allTasks;

import java.util.Arrays;

class TestFindReadBooks {

    public static void main(String[] args) {
        TestFindReadBooks method = new TestFindReadBooks();
        method.testFindReadBooks();
    }

    void testFindReadBooks() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque");
        bookReader.addBookToTheLibrary("To Kill a Mockingbird", "Harper Lee");
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        bookReader.addBookToTheLibrary("Harry Potter and the Philosopher’s Stone", "J.K. Rowling");
        bookReader.addBookToTheLibrary("The Lord of the Rings", "J.R.R. Tolkien");

        bookReader.readBook("All Quiet on the Western Front");
        bookReader.readBook("1984");
        bookReader.readBook("The Lord of the Rings");

        String[] expectedResult = {"All Quiet on the Western Front [Erich Maria Remarque]",
                "1984 [George Orwell]", "The Lord of the Rings [J.R.R. Tolkien]"};
        check(expectedResult, bookReader.findReadBooks(), "testFindReadBooks");
    }

    void check(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
