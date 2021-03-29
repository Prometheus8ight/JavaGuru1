package students.vitaly_porsev.lesson_10.level_5.allTasks;

class TestEmptyTitleAndAuthor {

    public static void main(String[] args) {
        TestEmptyTitleAndAuthor method = new TestEmptyTitleAndAuthor();
        method.testTitleEmptiness();
        method.testAuthorEmptiness();
        method.testTitleAndAuthorEmptiness();

    }

    void testTitleEmptiness() {
        BookReaderImpl method = new BookReaderImpl();
        checkFalse(false, method.addBookToTheLibrary("", "Erich Maria Remarque"), "testTitleEmptiness");
    }

    void testAuthorEmptiness() {
        BookReaderImpl method = new BookReaderImpl();
        checkFalse(false, method.addBookToTheLibrary("All Quiet on the Western Front", ""), "testAuthorEmptiness");
    }

    void testTitleAndAuthorEmptiness() {
        BookReaderImpl method = new BookReaderImpl();
        checkFalse(false, method.addBookToTheLibrary("", ""), "testTitleAndAuthorEmptiness");
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