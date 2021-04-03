package students.vitaly_porsev.lesson_11.level_2.allTasks;

public class TestCountAllBooks {
    public static void main(String[] args) {
        TestCountAllBooks method = new TestCountAllBooks();
        method.countAllBooksTest();
    }

    void countAllBooksTest() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("Kate Atkinson", "Life After Life"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        method.save(new Book("Jill McCorcle", "Life After Life"));
        method.save(new Book("Dan Braun", "Inferno"));
        method.save(new Book("Stephen King", "Doctor Sleep"));
        check(6, method.countAllBooks(), "countAllBooksTest");
    }

    private void check(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
