package students.vitaly_porsev.lesson_10.level_6.allTasks;

import java.util.Arrays;

class TestFindBooksWithEqualWordsInTitle {
    public static void main(String[] args) {
        TestFindBooksWithEqualWordsInTitle method = new TestFindBooksWithEqualWordsInTitle();
        method.findBooksByNotEqualTitle();

    }

    void findBooksByNotEqualTitle() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBookToTheLibrary("Harry Potter and the Sorcerer’s Stone", "J.K. Rowling");
        bookReader.addBookToTheLibrary("To Kill a Mockingbird", "Leon Edel");
        bookReader.addBookToTheLibrary("Harry Potter and the Chamber of Secrets", "J.K. Rowling");
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        bookReader.addBookToTheLibrary("My Life", "Leon Trotsky");
        bookReader.addBookToTheLibrary("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling");
        String[] expectedResult = {"Harry Potter and the Sorcerer’s Stone [J.K. Rowling]",
                "Harry Potter and the Chamber of Secrets [J.K. Rowling]",
                "Harry Potter and the Prisoner of Azkaban [J.K. Rowling]"};
        check(expectedResult, bookReader.findBooksWithEqualWordsInTitle("Potter"), "findBooksByNotEqualTitle");
    }


    private void check(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
