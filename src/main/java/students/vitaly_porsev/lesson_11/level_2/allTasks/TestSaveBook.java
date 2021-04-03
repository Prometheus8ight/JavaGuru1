package students.vitaly_porsev.lesson_11.level_2.allTasks;

import java.util.Arrays;
import java.util.List;

public class TestSaveBook {
    public static void main(String[] args) {
        TestSaveBook method = new TestSaveBook();
        method.checkSaveTest();
    }

    void checkSaveTest() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        Book[] expectedResult = {new Book("Marcel Proust", "In Search of Lost Time"),
                new Book("James Joyce", "Ulysses"),
                new Book("Miguel de Cervantes", "Don Quixote")};
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("James Joyce", "Ulysses"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        check(Arrays.asList(expectedResult), method.getLibrary(), "checkSaveTest");
    }

    private void check(List<Book> expectedResult, List<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
