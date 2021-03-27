package students.vitaly_porsev.lesson_10.level_5.allTasks;

public class TestSaveBook {

    public static void main(String[] args) {
        TestSaveBook method = new TestSaveBook();
        method.testTrueAddBook();
        method.testFalseAddBook();
    }

    void testTrueAddBook() {
        BookReaderImpl method = new BookReaderImpl();
        checkTrue(true, method.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque"), "testTrueAddBook");
    }

    void testFalseAddBook() {
        BookReaderImpl method = new BookReaderImpl();
        boolean isTrue = method.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque");
        checkFalse(false, method.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque"), "testFalseAddBook");
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
