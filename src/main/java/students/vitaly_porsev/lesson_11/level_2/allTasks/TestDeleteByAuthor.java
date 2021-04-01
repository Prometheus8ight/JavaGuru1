package students.vitaly_porsev.lesson_11.level_2.allTasks;

import java.util.Arrays;
import java.util.List;

public class TestDeleteByAuthor {
    public static void main(String[] args) {
        TestDeleteByAuthor method = new TestDeleteByAuthor();
        method.DeleteByAuthorTest();
    }

    void DeleteByAuthorTest() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("Kate Atkinson", "Life After Life"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        method.save(new Book("Stephen King", "Four Past Midnight"));
        method.save(new Book("Dan Braun", "Inferno"));
        method.save(new Book("Stephen King", "Doctor Sleep"));
        method.save(new Book("Kate Atkinson", "A God in Ruins"));
        method.deleteByAuthor("Marcel Proust");
        method.deleteByAuthor("Kate Atkinson");
        Book[] books = {new Book("Miguel de Cervantes", "Don Quixote"),
                new Book("Stephen King", "Four Past Midnight"), new Book("Dan Braun", "Inferno"),
                new Book("Stephen King", "Doctor Sleep")};
        check(Arrays.asList(books), method.getLibrary(), "DeleteByAuthorTest");
    }

    private void check(List<Book> expectedResult, List<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
