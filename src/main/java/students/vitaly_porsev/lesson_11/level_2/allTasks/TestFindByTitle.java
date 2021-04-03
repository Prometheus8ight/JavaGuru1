package students.vitaly_porsev.lesson_11.level_2.allTasks;

import java.util.Arrays;
import java.util.List;

public class TestFindByTitle {
    public static void main(String[] args) {
        TestFindByTitle method = new TestFindByTitle();
        method.FindByIdTitleTest();
    }

    void FindByIdTitleTest() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("Kate Atkinson", "Life After Life"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        method.save(new Book("Jill McCorcle", "Life After Life"));
        method.save(new Book("Dan Braun", "Inferno"));
        method.save(new Book("Stephen King", "Doctor Sleep"));
        Book[] authors = {new Book("Kate Atkinson", "Life After Life"),
                new Book("Jill McCorcle", "Life After Life")};
        check(Arrays.asList(authors), method.findByTitle("Life After Life"), "FindByIdTitle");
    }

    private void check(List<Book> expectedResult, List<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
