package students.vitaly_porsev.lesson_11.level_4.allTasks;

import java.util.Arrays;

class TestFindUniqueTitle {
    public static void main(String[] args) {
        TestFindUniqueTitle method = new TestFindUniqueTitle();
        method.TestFindUniqueTitle();
    }

    void TestFindUniqueTitle() {
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        String[] expectedResult = {"Bag of Bones", "Don Quixote", "In Search of Lost Time", "Life After Life",
                "Inferno"};
        checkStrings(expectedResult, book.findUniqueTitles().toArray(new String[0]), "TestFindUniqueTitle");
    }

    private void checkStrings(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

}
