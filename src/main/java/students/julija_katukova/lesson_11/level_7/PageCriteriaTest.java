package students.julija_katukova.lesson_11.level_7;

import java.util.ArrayList;
import java.util.List;

class PageCriteriaTest {

    public static void main(String[] args) {
        PageCriteriaTest pageCriteriaTest = new PageCriteriaTest();
        pageCriteriaTest.test1();

    }

    private void test1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Fyodor Dostoyevsky", "The Brothers Karamazov");
        Book book3 = new Book("Fyodor Dostoyevsky", "Crime and Punishment");
        Book book4 = new Book("George Orwell", "1984");
        Book book5 = new Book("Jane Austen", "Pride and Prejudice");
        Book book6 = new Book("William Shakespeare", "Hamlet");
        Book book7 = new Book("Leo Tolstoy", "Anna Karenina");
        Book book8 = new Book("Gabriel García Marquez", "One Hundred Years of Solitude");
        Book book9 = new Book("Albert Camus", "The Stranger");
        Book book10 = new Book("Homer", "The Odyssey");
        Book book11 = new Book("Robert Musil", "The Man Without Qualities");
        Book book12 = new Book ("Franz Kafka", "The Trial");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        bookDatabase.save(book5);
        bookDatabase.save(book6);
        bookDatabase.save(book7);
        bookDatabase.save(book8);
        bookDatabase.save(book9);
        bookDatabase.save(book10);
        bookDatabase.save(book11);
        bookDatabase.save(book12);

        PageCriteria pageCriteria = new PageCriteria();

        List<Book> realResult = pageCriteria.getBooksForDisplay(bookDatabase.getBooks());
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        expectedResult.add(book4);
        expectedResult.add(book5);
        expectedResult.add(book6);
        expectedResult.add(book7);
        expectedResult.add(book8);
        expectedResult.add(book9);
        expectedResult.add(book10);
        expectedResult.add(book11);
        expectedResult.add(book12);
        check(realResult, expectedResult, "Test 1-0");

        pageCriteria.setPageSize(3);
        pageCriteria.setPageNumber(1);
        realResult = pageCriteria.getBooksForDisplay(bookDatabase.getBooks());
        expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        check(realResult, expectedResult, "Test 1-1");

        pageCriteria.setPageNumber(2);
        realResult = pageCriteria.getBooksForDisplay(bookDatabase.getBooks());
        expectedResult = new ArrayList<>();
        expectedResult.add(book4);
        expectedResult.add(book5);
        expectedResult.add(book6);
        check(realResult, expectedResult, "Test 1-2");

        pageCriteria.setPageNumber(3);
        realResult = pageCriteria.getBooksForDisplay(bookDatabase.getBooks());
        expectedResult = new ArrayList<>();
        expectedResult.add(book7);
        expectedResult.add(book8);
        expectedResult.add(book9);
        check(realResult, expectedResult, "Test 1-3");

        pageCriteria.setPageNumber(4);
        realResult = pageCriteria.getBooksForDisplay(bookDatabase.getBooks());
        expectedResult = new ArrayList<>();
        expectedResult.add(book10);
        expectedResult.add(book11);
        expectedResult.add(book12);
        check(realResult, expectedResult, "Test 1-4");


        pageCriteria.setPageSize(2);
        pageCriteria.setPageNumber(2);
        realResult = pageCriteria.getBooksForDisplay(bookDatabase.getBooks());
        expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        expectedResult.add(book4);
        check(realResult, expectedResult, "Test 2");

        pageCriteria.setPageSize(1);
        pageCriteria.setPageNumber(7);
        realResult = pageCriteria.getBooksForDisplay(bookDatabase.getBooks());
        expectedResult = new ArrayList<>();
        expectedResult.add(book7);
        check(realResult, expectedResult, "Test 3");
    }

    private void check(List<Book> realResult, List<Book> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
