package students.kate_br.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("Brave New World", "Aldous Huxley");
        Book book2 = new Book("Glue", "Irvine Welsh");

        books.add(book1);
        books.add(book2);


        Book bookInTheList = new Book("Glue", "Irvine Welsh");
        books.add(bookInTheList);
        boolean containsBook = books.contains(bookInTheList);

        Book bookNotInTheList = new Book("A Clockwork Orange", "Anthony Burgess");
        books.add(bookInTheList);
        boolean notContainsBook = books.contains(bookNotInTheList);

        System.out.println(books.contains(bookInTheList));
        System.out.println(books.contains(bookNotInTheList));
    }






 }
