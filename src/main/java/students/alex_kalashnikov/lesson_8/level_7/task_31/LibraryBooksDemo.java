package students.alex_kalashnikov.lesson_8.level_7.task_31;

import java.util.Arrays;

class LibraryBooksDemo {

    public static void main(String[] args) {
        
        Repository repository = new Repository();

        repository.addBook(new LibraryBooks("Clean Code", "Robert Martin"));
        repository.addBook(new LibraryBooks("Head First Java", "Kathy Sierra"));
        repository.addBook(new LibraryBooks("Head First Design Patterns", "Eric Freeman"));

        System.out.println("Find book by ID number: \n" + repository.findById(3));
        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));

        repository.getBook(2, "Vasily Pupkin", "vasya1234@mail.ru");
        repository.getBook(3, "John Johnson", "john_j31@gmail.com");

        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));
        System.out.println("Show all users: \n" + Arrays.toString(repository.findAllUsers()));

        repository.reserveBook(2, "Janis Ozolins", "janis1234@yahoo.com");
        repository.returnBook(3);

        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));
        System.out.println("Show all users: \n" + Arrays.toString(repository.findAllUsers()));

        repository.cancelReservation(2);

        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));
        System.out.println("Show all users: \n" + Arrays.toString(repository.findAllUsers()));

        repository.reserveBook(3, "Janis Berzins", "jb9876@gmail.com");

        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));
        System.out.println("Show all users: \n" + Arrays.toString(repository.findAllUsers()));

        repository.getBook(3, "Janis Berzins", "jb9876@gmail.com");

        System.out.println("Show all books: \n" + Arrays.toString(repository.findAll()));
        System.out.println("Show all users: \n" + Arrays.toString(repository.findAllUsers()));

    }

}