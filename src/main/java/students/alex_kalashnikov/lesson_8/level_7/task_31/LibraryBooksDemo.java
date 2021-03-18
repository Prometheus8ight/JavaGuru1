package students.alex_kalashnikov.lesson_8.level_7.task_31;

import java.util.Arrays;

class LibraryBooksDemo {

    public static void main(String[] args) {

        BooksRepository repository = new BooksRepository();
        repository.addBook(new LibraryBooks("Clean Code", "Robert Martin"));
        repository.addBook(new LibraryBooks("Head First Java", "Kathy Sierra"));
        repository.addBook(new LibraryBooks("Head First Design Patterns", "Eric Freeman"));

        System.out.println("Find book by ID number: \n" + repository.findById(3));

        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));

        repository.getBook(2, "User1");

        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));

        repository.getBook(2, "User2");

        System.out.println("Show all available books: \n" + Arrays.toString(repository.findAvailable()));


        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));
        System.out.println("Show all available books: \n" + Arrays.toString(repository.findAvailable()));

        repository.reserveBook(2,"User3");

        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));

        repository.returnBook(2);

        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));

        repository.reserveBook(2, "User4");

        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));





    }

}
