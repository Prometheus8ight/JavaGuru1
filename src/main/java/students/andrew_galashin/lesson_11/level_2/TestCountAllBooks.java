package students.andrew_galashin.lesson_11.level_2;


class TestCountAllBooks {
    public static void main(String[] args) {
        TestCountAllBooks method = new TestCountAllBooks();
        method.countAllBooksTest();
    }

    void countAllBooksTest() {
        BookDatabaseImpl start = new BookDatabaseImpl();
        start.save(new Book("Author", "1"));
        start.save(new Book("Author2", "2"));
        start.save(new Book("Author3", "3"));
        start.save(new Book("Author4", "4"));
        start.save(new Book("Author5", "5"));
        start.save(new Book("Author6", "6"));
        check(6, start.countBooks(), "Test");
    }

    private void check(int result, int expected, String testName) {
        if (result == expected) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
