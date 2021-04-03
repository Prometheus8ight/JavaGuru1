package students.vitaly_porsev.lesson_11.level_4.allTasks;

import java.util.Arrays;

public class TestFindUniqueAuthors {
    public static void main(String[] args) {
        TestFindUniqueAuthors method = new TestFindUniqueAuthors();
        method.TestFindUniqueAuthors();
    }

    void TestFindUniqueAuthors() {
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));
        book.save(new Book("Bag", "Stephen King", "2000"));

        String[] expectedResult = {"Kate Atkinson", "Dan Braun", "Marcel Proust", "Jill McCorcle",
                "Miguel de Cervantes", "Stephen King"};
        checkStrings(expectedResult, book.findUniqueAuthors().toArray(new String[0]), "TestFindUniqueAuthors");
    }

    private void checkStrings(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
