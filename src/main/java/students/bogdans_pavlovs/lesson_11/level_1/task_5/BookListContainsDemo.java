package students.bogdans_pavlovs.lesson_11.level_1.task_5;

/*
Создайте класс BookListContainsDemo в котором продемонстрируйте как
делают проверку есть ли в списке книга или её нет с помощью метода
contains(). Если для правильной работы метода contains() требуется
внести изменения в класс Book, сделайте это!
*/


import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);

        boolean containsBook = books.contains(book1); // должно быть true
        boolean notContainsBook = books.contains(book2); // должно быть false

        System.out.println(containsBook);
        System.out.println(notContainsBook);


    }



}
