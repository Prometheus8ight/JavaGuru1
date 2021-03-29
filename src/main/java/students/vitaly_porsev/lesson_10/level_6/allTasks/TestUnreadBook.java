package students.vitaly_porsev.lesson_10.level_6.allTasks;

class TestUnreadBook {

    public static void main(String[] args) {
        TestUnreadBook method = new TestUnreadBook();
        method.testUnreadBookTrue();
        method.testUnreadBookFalse();
        method.testObjectBoolean();
    }

    void testUnreadBookTrue(){
        BookReaderImpl bookReader= new BookReaderImpl();
        bookReader.addBookToTheLibrary("War and Peace", "Leo Tolstoy");
        bookReader.readBook("War and Peace");
        checkTrue(true, bookReader.unreadBook("War and Peace"), "testUnreadBookTrue");
    }

    void testUnreadBookFalse(){
        BookReaderImpl bookReader= new BookReaderImpl();
        bookReader.addBookToTheLibrary("All Quiet on the Western Front", "Erich Maria Remarque");
        bookReader.addBookToTheLibrary("To Kill a Mockingbird", "Harper Lee");
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        checkFalse(false, bookReader.unreadBook("War and Peace"), "testUnreadBookFalse");
    }

    void testObjectBoolean(){
        BookReaderImpl bookReader= new BookReaderImpl();
        bookReader.addBookToTheLibrary("1984", "George Orwell");
        bookReader.readBook("1984");
        bookReader.unreadBook("1984");
        checkFalse(false, bookReader.getLibrary()[0].isReadBook(), "testObjectBoolean");
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
