package students.vitaly_porsev.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Gulliver's Travels", "Jonathan Swift"));
        books.add(new Book("The Stories of Anton Chekhov", "Anton Chekhov"));
        books.add(new Book("The Aeneid", "Virgil"));

        Book book1 = new Book("The Aeneid", "Virgil");
        Book book2 = new Book("David Copperfield", "Charles Dickens");

        System.out.println(books.contains(book1));
        System.out.println(books.contains(book2));


    }
}