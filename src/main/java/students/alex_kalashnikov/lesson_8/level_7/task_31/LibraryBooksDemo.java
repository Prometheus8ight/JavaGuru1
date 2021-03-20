package students.alex_kalashnikov.lesson_8.level_7.task_31;

import java.util.Arrays;

class LibraryBooksDemo {

    public static void main(String[] args) {

        BooksRepository.addBook(new LibraryBooks("Clean Code", "Robert Martin"));
        BooksRepository.addBook(new LibraryBooks("Head First Java", "Kathy Sierra"));
        BooksRepository.addBook(new LibraryBooks("Head First Design Patterns", "Eric Freeman"));

        System.out.println("Find book by ID number: \n" + BooksRepository.findById(3));
        System.out.println("Show all books: \n" + Arrays.toString(BooksRepository.findAll()));

        BooksRepository.getBook(2, "Vasily Pupkin", "vasya1234@mail.ru");
        BooksRepository.getBook(3, "John Johnson", "john_j31@gmail.com");

        System.out.println("Show all books: \n" + Arrays.toString(BooksRepository.findAll()));
        System.out.println("Show all users: \n" + Arrays.toString(UserRepository.findAllUsers()));

        BooksRepository.reserveBook(2, "Janis Ozolins", "janis1234@yahoo.com");
        BooksRepository.returnBook(3);

        System.out.println("Show all books: \n" + Arrays.toString(BooksRepository.findAll()));
        System.out.println("Show all users: \n" + Arrays.toString(UserRepository.findAllUsers()));

        BooksRepository.cancelReservation(2);

        System.out.println("Show all books: \n" + Arrays.toString(BooksRepository.findAll()));
        System.out.println("Show all users: \n" + Arrays.toString(UserRepository.findAllUsers()));

    }

}