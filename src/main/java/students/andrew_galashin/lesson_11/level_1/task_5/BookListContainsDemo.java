package students.andrew_galashin.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {
        BookListContainsDemo x = new BookListContainsDemo();
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("A1", "B1");
        books.add(bookInTheList);
        boolean containsBook = books.contains(bookInTheList); // должно быть true
        x.check(containsBook, true);
        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false
        x.check(notContainsBook, false);
    }

    void check(boolean result, boolean expected) {
        if (result == expected) {
            System.out.println("Complete");
        } else {
            System.out.println("Fail");
        }
    }
}
