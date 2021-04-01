package students.vitaly_porsev.lesson_11.level_2.allTasks;

import java.util.Arrays;
import java.util.List;

public class TestFindByAuthor {
    public static void main(String[] args) {
        TestFindByAuthor method = new TestFindByAuthor();
        method.FindByIdAuthor();
    }

    void FindByIdAuthor() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("Stephen King", "Bag of Bones"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        method.save(new Book("Stephen King", "Lisey's Story"));
        method.save(new Book("Dan Braun", "Inferno"));
        method.save(new Book("Stephen King", "Doctor Sleep"));
        Book[] king = {new Book("Stephen King", "Bag of Bones"), new Book("Stephen King", "Lisey's Story"),
                new Book("Stephen King", "Doctor Sleep")};
        check(Arrays.asList(king), method.findByAuthor("Stephen King"), "FindByIdAuthor");
    }

    private void check(List<Book> expectedResult, List<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
