package students.rodion_afanasjev.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {

        List<Book> library = new ArrayList<>();

        library.add(new Book("Gogol","Dead Souls"));
        library.add(new Book("Robert Martin","Clean Code"));

        Book book1 = new Book("Gogol","Dead Souls");
        Book book2 = new Book("Rowling J.","Harry Potter");

        System.out.println(library.size());

        System.out.println(library.contains(book1));
        System.out.println(library.contains(book2));

        System.out.println(library);



    }

}
