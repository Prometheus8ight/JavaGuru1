package students.vitaly_porsev.lesson_11.level_2.allTasks;

import java.util.Optional;

public class TestFindById {
    public static void main(String[] args) {
        TestFindById testFindById = new TestFindById();
        testFindById.FindByIdTest();
        testFindById.FindByIdEmptyTest();
    }

    void FindByIdTest() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("James Joyce", "Ulysses"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        Optional<Book> expectedResult = Optional.of(new Book("Miguel de Cervantes", "Don Quixote"));
        check(expectedResult, method.findById(3L), "FindByIdTest");
    }

    void FindByIdEmptyTest() {
        BookDatabaseImpl method = new BookDatabaseImpl();
        method.save(new Book("Marcel Proust", "In Search of Lost Time"));
        method.save(new Book("James Joyce", "Ulysses"));
        method.save(new Book("Miguel de Cervantes", "Don Quixote"));
        Optional<Book> expectedResult = Optional.empty();
        check(expectedResult, method.findById(10L), "FindByIdEmptyTest");
    }

    private void check(Optional<Book> expectedResult, Optional<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
