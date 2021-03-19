package main.java.students.julija_katukova.lesson_8.level_7.task_31;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

class BookRepository {

    Book[] availableBooks = new Book[5];
    Book[] unavailableBooks = new Book[1];

    Book[] findAllAvailableBooks() {
        return availableBooks;
    }

    Book[] findAllNotBooks() {
        return unavailableBooks;
    }


    public static void main(String[] args) {
        Book book1 = new Book("16542", "ULYSSES", "Scott Fitzgerald");
        Book book2 = new Book("571147", "THE GRAPES OF WRATH", "John Steinbeck");
        Book book3 = new Book("1457831", "LOLITA", "Vladimir Nabokov");
        Book book4 = new Book("56855", "BRAVE NEW WORLD", "Aldous Huxley");
        Book book5 = new Book("878965", "CATCH-22", "Joseph Heller");

        BookRepository bookRepository = new BookRepository();
        bookRepository.addNewBook(book1);
        bookRepository.addNewBook(book2);
        bookRepository.addNewBook(book3);
        bookRepository.addNewBook(book4);
        bookRepository.addNewBook(book5);

        System.out.println(Arrays.toString(bookRepository.findAllAvailableBooks()));

    }

    void addNewBook(Book book) {
        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i] == null) {
                availableBooks[i] = book;
                break;
            }
        }
    }

    void takeBook(Book book, User userId) {
        if(isBookAvailable(book)) {
            moveBookFromAvailableToUnavailable(book, userId, unavailableBooks);
            book.setBorrowed(true);
            book.setDueToDate(getReturnDateForBorrowedBook());
        }
    }

    private boolean isBookAvailable(Book book) {
        for (Book availableBook : availableBooks) {
            if (availableBook.getId().equals(book.getId())) {
                return true;
            }
        }
        return false;
    }

    void moveBookFromAvailableToUnavailable(Book book, User userId, Book[] unavailableBooks) {
        if (!isFirstUnavailableBook()) {
            this.unavailableBooks = extendUnavailableBookArray(unavailableBooks);
        }
        addUnavailableBook(book, userId);
    }


    private boolean isFirstUnavailableBook() {
        return unavailableBooks[0] == null;
    }

    void addUnavailableBook(Book book, User userId) {
        String id = book.getId();
        String title = book.getTitle();
        String author = book.getAuthor();
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        Book book1 = new Book(id, title, author, false, false, userId, currentDate);
        unavailableBooks[unavailableBooks.length - 1] = book1;
    }

    private Book[] extendUnavailableBookArray(Book[] unavailableBooks) {
        Book[] out = new Book[unavailableBooks.length + 1];
        System.arraycopy(unavailableBooks, 0, out, 0, unavailableBooks.length);
        return out;
    }

    private Date getReturnDateForBorrowedBook() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 14); //borrowing period 2 weeks
        return calendar.getTime();
    }

}
