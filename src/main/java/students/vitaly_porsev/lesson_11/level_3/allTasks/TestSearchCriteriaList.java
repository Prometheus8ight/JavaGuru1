package students.vitaly_porsev.lesson_11.level_3.allTasks;

import java.util.Arrays;
import java.util.List;

public class TestSearchCriteriaList {
    public static void main(String[] args) {
        TestSearchCriteriaList method = new TestSearchCriteriaList();
        method.titleAndAuthorTest();
        method.authorAndYearTest();
        method.titleAndYearTest();
        method.titleOrAuthorTest();
        method.titleOrYearTest();
        method.authorOrYearTest();
    }

    void titleAndAuthorTest() {
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        Book[] mig = {new Book("Don Quixote", "Miguel de Cervantes", "1605")};
        check(Arrays.asList(mig),
                book.find(new AndSearchCriteria(new TitleSearchCriteria("Don Quixote"), new AuthorSearchCriteria("Miguel de Cervantes"))),
                "titleAndAuthorTest");
    }

    void authorAndYearTest() {
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        Book[] mig = {new Book("Inferno", "Dan Braun", "2013")};
        check(Arrays.asList(mig),
                book.find(new AndSearchCriteria(new AuthorSearchCriteria("Dan Braun"),
                        new YearOfIssueSearchCriteria("2013"))),
                "authorAndYearTest");
    }

    void titleAndYearTest() {
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        Book[] mig = {new Book("Bag of Bones", "Stephen King", "1998")};
        check(Arrays.asList(mig),
                book.find(new AndSearchCriteria(new TitleSearchCriteria("Bag of Bones"),
                        new YearOfIssueSearchCriteria("1998"))),
                "titleAndYearTest");
    }

    void titleOrAuthorTest() {
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        Book[] mig = {new Book("Life After Life", "Kate Atkinson", "2013"),
                new Book("Life After Life", "Jill McCorcle", "2013")};
        check(Arrays.asList(mig),
                book.find(new OrSearchCriteria(new TitleSearchCriteria("Life After Life"),
                        new AuthorSearchCriteria("Jill McCorcle"))),
                "titleOrAuthorTest");
    }

    void titleOrYearTest() {
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Life After Life", "Kate Atkinson", "2013"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        Book[] mig = {new Book("Life After Life", "Kate Atkinson", "2013"),
                new Book("Life After Life", "Jill McCorcle", "2013"),
                new Book("Inferno", "Dan Braun", "2013")};
        check(Arrays.asList(mig),
                book.find(new OrSearchCriteria(new TitleSearchCriteria("Inferno"),
                        new YearOfIssueSearchCriteria("2013"))),
                "titleOrYearTest");
    }

    void authorOrYearTest() {
        BookDatabaseImpl book = new BookDatabaseImpl();

        book.save(new Book("In Search of Lost Time", "Marcel Proust", "1913"));
        book.save(new Book("Don Quixote", "Miguel de Cervantes", "1605"));
        book.save(new Book("Life After Life", "Jill McCorcle", "2013"));
        book.save(new Book("La Galatea", "Miguel de Cervantes", "1585"));
        book.save(new Book("Inferno", "Dan Braun", "2013"));
        book.save(new Book("Bag of Bones", "Stephen King", "1998"));

        Book[] mig = {new Book("Don Quixote", "Miguel de Cervantes", "1605"),
                new Book("La Galatea", "Miguel de Cervantes", "1585")};
        check(Arrays.asList(mig),
                book.find(new OrSearchCriteria(new AuthorSearchCriteria("Miguel de Cervantes"),
                        new YearOfIssueSearchCriteria("1600"))),
                "authorOrYearTest");
    }

    void check(List<Book> expectedResult, List<Book> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
