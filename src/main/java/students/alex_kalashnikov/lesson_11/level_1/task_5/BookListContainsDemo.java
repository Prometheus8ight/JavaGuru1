package students.alex_kalashnikov.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("A1", "B1"));
        books.add(new Book("A2", "B2"));
        System.out.println(books.contains(new Book("A1", "B1")));
        System.out.println(books.contains(new Book("A3", "B3")));
        System.out.println(books.contains(new Book("A1", "B2")));

    }

}