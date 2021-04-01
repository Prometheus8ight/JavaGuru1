package students.vitaly_porsev.lesson_11.level_2.allTasks;

import java.util.Arrays;
import java.util.List;

public class TestDeleteObject {

    public static void main(String[] args) {
        TestDeleteObject method = new TestDeleteObject();
        method.checkDeleteObjectTestTrue();
        method.checkDeleteObjectTestFalse();
    }

    void checkDeleteObjectTestTrue() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        Book[] expectedResult = {new Book("Marcel Proust", "In Search of Lost Time"),
                new Book("Miguel de Cervantes", "Don Quixote")};
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("James Joyce", "Ulysses"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        method.deleteObject(new Book("James Joyce", "Ulysses"));
        checkTrue(Arrays.asList(expectedResult), method.getLibrary(), "checkDeleteObjectTestTrue");
    }

    void checkDeleteObjectTestFalse() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("James Joyce", "Ulysses"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        checkFalse(false, method.deleteObject(new Book("William Shakespeare", "Hamlet")), "checkDeleteObjectTestFalse");
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
