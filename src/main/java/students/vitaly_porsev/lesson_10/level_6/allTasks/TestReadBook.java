package students.vitaly_porsev.lesson_10.level_6.allTasks;

class TestReadBook {

    public static void main(String[] args) {
        TestReadBook method = new TestReadBook();
        method.testReadBookTrue();
        method.testReadBookFalse();
        method.testObjectBoolean();
    }

    void testReadBookTrue() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBookToTheLibrary("War and Peace", "Leo Tolstoy");
        checkTrue(true, bookReader.readBook("War and Peace"), "testReadBookTrue");
    }

    void testReadBookFalse() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque");
        bookReader.addBookToTheLibrary("To Kill a Mockingbird", "Harper Lee");
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        checkFalse(false, bookReader.readBook("War and Peace"), "testReadBookFalse");
    }

    void testObjectBoolean() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        bookReader.readBook("1984");
        checkTrue(true, bookReader.getLibrary()[0].isReadBook(), "testObjectBoolean");
    }


    void checkTrue(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    void checkFalse(boolean expectedResult, boolean realResult, String testName) {
        if (!expectedResult == !realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
