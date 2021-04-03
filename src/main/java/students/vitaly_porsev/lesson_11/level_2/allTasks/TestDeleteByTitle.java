package students.vitaly_porsev.lesson_11.level_2.allTasks;

import java.util.Arrays;
import java.util.List;

public class TestDeleteByTitle {
    public static void main(String[] args) {
        TestDeleteByTitle method = new TestDeleteByTitle();
        method.DeleteByTitleTest();
    }

    void DeleteByTitleTest() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("Kate Atkinson", "Life After Life"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        method.save(new Book("Jill McCorcle", "Life After Life"));
        method.save(new Book("Dan Braun", "Inferno"));
        method.save(new Book("Stephen King", "Doctor Sleep"));
        method.deleteByTitle("In Search of Lost Time");
        method.deleteByTitle("Life After Life");
        Book[] books = {new Book("Miguel de Cervantes", "Don Quixote"),
                new Book("Dan Braun", "Inferno"),
                new Book("Stephen King", "Doctor Sleep")};
        check(Arrays.asList(books), method.getLibrary(), "DeleteByTitleTest");
    }

    private void check(List<Book> expectedResult, List<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
