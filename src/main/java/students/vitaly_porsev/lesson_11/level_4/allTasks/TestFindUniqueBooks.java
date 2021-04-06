package students.vitaly_porsev.lesson_11.level_4.allTasks;

import java.util.HashSet;
import java.util.Set;

public class TestFindUniqueBooks {
    public static void main(String[] args) {
        TestFindUniqueBooks method = new TestFindUniqueBooks();
        method.TestFindUniqueBooks();
    }

    void TestFindUniqueBooks() {
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        expectedResult.add(new Book("Life After Life", "Kate Atkinson", "2013"));
        expectedResult.add(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        expectedResult.add(new Book("Life After Life", "Jill McCorcle", "2013"));
        expectedResult.add(new Book("Inferno", "Dan Braun", "2013"));
        expectedResult.add(new Book("Bag of Bones", "Stephen King", "1998"));

        checkObjects(expectedResult, book.findUniqueBooks(), "TestFindUniqueBooks");
    }

    private void checkObjects(Set<Book> expectedResult, Set<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
