package students.vitaly_porsev.lesson_11.level_7.task_39And40;

import java.util.Arrays;
import java.util.List;

public class PageCriteriaTest {
    public static void main(String[] args) {
        PageCriteriaTest method = new PageCriteriaTest();
        method.pageCriteriaTest1();
        method.pageCriteriaTest2();
        method.pageCriteriaTest3();
        method.pageCriteriaTest4();
    }

    void pageCriteriaTest1() {
        BookDatabase book = new BookDatabaseImpl();
        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        PageCriteria pageCriteria = new PageCriteria("1", "3", "");

        Book[] newLibrary = {new Book("In Search of Lost Time", "Marcel Proust", "1913"),
                new Book("Life After Life", "Kate Atkinson", "2013"),
                new Book("Don Quixote", "Miguel de Cervantes", "1605")};
        check(Arrays.asList(newLibrary), pageCriteria.outputByPageCriteria(book.getLibrary()), "pageCriteriaTest1");
    }


    void pageCriteriaTest2() {
        BookDatabase book = new BookDatabaseImpl();
        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        PageCriteria pageCriteria = new PageCriteria("2", "3", "");

        Book[] newLibrary = {new Book("Life After Life", "Jill McCorcle", "2013"),
                new Book("Inferno", "Dan Braun", "2013"),
                new Book("Bag of Bones", "Stephen King", "1998")};
        check(Arrays.asList(newLibrary), pageCriteria.outputByPageCriteria(book.getLibrary()), "pageCriteriaTest2");
    }

    void pageCriteriaTest3() {
        BookDatabase book = new BookDatabaseImpl();
        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        PageCriteria pageCriteria = new PageCriteria("1", "3", "Yes");

        Book[] newLibrary = {new Book("Inferno", "Dan Braun", "2013"),
                new Book("Life After Life", "Jill McCorcle", "2013"),
                new Book("Life After Life", "Kate Atkinson", "2013")};
        check(Arrays.asList(newLibrary), pageCriteria.outputByPageCriteria(book.getLibrary()), "pageCriteriaTest3");

    }

    void pageCriteriaTest4() {
        BookDatabase book = new BookDatabaseImpl();
        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        PageCriteria pageCriteria = new PageCriteria("2", "3", "Yes");

        Book[] newLibrary = {new Book("In Search of Lost Time", "Marcel Proust", "1913"),
                new Book("Don Quixote", "Miguel de Cervantes", "1605"),
                new Book("Bag of Bones", "Stephen King", "1998")};
        check(Arrays.asList(newLibrary), pageCriteria.outputByPageCriteria(book.getLibrary()), "pageCriteriaTest4");
    }

    void check(List<Book> expectedResult, List<Book> readResult, String testName) {
        if (expectedResult.equals(readResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
