package students.vitaly_porsev.lesson_11.level_2.allTasks;

import java.util.Arrays;
import java.util.List;

public class TestDeleteBookById {
    public static void main(String[] args) {
        TestDeleteBookById method = new TestDeleteBookById();
        method.checkDeleteTestByIDTrue();
        method.checkDeleteTestByIDFalse();
    }

    void checkDeleteTestByIDTrue() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        Book[] expectedResult = {new Book("Marcel Proust", "In Search of Lost Time"),
                new Book("Miguel de Cervantes", "Don Quixote")};
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("James Joyce", "Ulysses"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        method.deleteByID(2L);
        checkTrue(Arrays.asList(expectedResult), method.getLibrary(), "checkDeleteTestByIDTrue");
    }

    void checkDeleteTestByIDFalse() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("James Joyce", "Ulysses"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        method.deleteByID(2L);
        checkFalse(false, method.deleteByID(5L), "checkDeleteTestByIDFalse");
    }

    private void checkTrue(List<Book> expectedResult, List<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    private void checkFalse(boolean expectedResult, boolean realResult, String testName) {
        if (!expectedResult == !realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
