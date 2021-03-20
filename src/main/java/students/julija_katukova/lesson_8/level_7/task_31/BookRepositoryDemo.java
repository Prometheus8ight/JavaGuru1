package main.java.students.julija_katukova.lesson_8.level_7.task_31;

import java.util.Arrays;

class BookRepositoryDemo {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        System.out.println(Arrays.toString(bookRepository.findAllAvailableBooks()));
        System.out.println(Arrays.toString(bookRepository.findAllUnavailableBooks()));

        Book book1 = new Book("16542", "ULYSSES", "Scott Fitzgerald");
        Book book2 = new Book("571147", "THE GRAPES OF WRATH", "John Steinbeck");
        Book book3 = new Book("1457831", "LOLITA", "Vladimir Nabokov");
        Book book4 = new Book("56855", "BRAVE NEW WORLD", "Aldous Huxley");
        Book book5 = new Book("878965", "CATCH-22", "Joseph Heller");

        bookRepository.addNewBook(book1);
        bookRepository.addNewBook(book2);
        bookRepository.addNewBook(book3);
        bookRepository.addNewBook(book4);
        bookRepository.addNewBook(book5);

        User user1 = new User("AK-895", "Anna", "Klein", "annak23@gmail.com", 0);
        User user2 = new User("TR-25596", "Tom", "Raoul", "tommyra45@gmail.com", 0);
        User user3 = new User("JP-7832", "Jo", "Pitt", "jojopi@gmail.com", 0);

        UserRepository libraryUsersRepository = new UserRepository();
        libraryUsersRepository.addNewUser(user1);
        libraryUsersRepository.addNewUser(user2);
        libraryUsersRepository.addNewUser(user3);

        System.out.println(Arrays.toString(bookRepository.findAllAvailableBooks()));
        System.out.println(Arrays.toString(bookRepository.findAllUnavailableBooks()));

        bookRepository.takeBook(book1, user1);
        System.out.println(Arrays.toString(bookRepository.findAllAvailableBooks()));
        System.out.println(Arrays.toString(bookRepository.findAllUnavailableBooks()));

        bookRepository.returnBook(book1);
        System.out.println(Arrays.toString(bookRepository.findAllAvailableBooks()));
        System.out.println(Arrays.toString(bookRepository.findAllUnavailableBooks()));

        System.out.println(bookRepository.findBookById("1457831").toString());

        bookRepository.reserveBook(book2, user3);
        System.out.println(Arrays.toString(bookRepository.findAllAvailableBooks()));
        System.out.println(Arrays.toString(bookRepository.findAllUnavailableBooks()));

        bookRepository.sendNotifications(book4, user2);

        bookRepository.issuePenalty(book4, user1);
    }
}
