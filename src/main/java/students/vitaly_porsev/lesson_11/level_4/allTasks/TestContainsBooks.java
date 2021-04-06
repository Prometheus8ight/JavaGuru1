package students.vitaly_porsev.lesson_11.level_4.allTasks;

public class TestContainsBooks {
    public static void main(String[] args) {
        TestContainsBooks method = new TestContainsBooks();
        method.TestContainsBook();
    }

    void TestContainsBook() {
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        checkBoolean(true, book.contains(new Book("Don Quixote", "Miguel de Cervantes", "1605")), "TestContainsBook");
    }

    private void checkBoolean(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
