package main.java.students.julija_katukova.lesson_8.level_7.task_31;

import java.util.Calendar;
import java.util.Date;

class BookRepository extends Library {

    Book[] availableBooks = new Book[5];
    Book[] unavailableBooks = new Book[1];

    Book[] findAllAvailableBooks() {
        return availableBooks;
    }

    Book[] findAllUnavailableBooks() {
        return unavailableBooks;
    }

    @Override
    void addNewBook(Book book) {
        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i] == null) {
                availableBooks[i] = book;
                break;
            }
        }
    }

    @Override
    void takeBook(Book book, User userId) {
        if (isBookAvailable(book)) {
            moveBookFromAvailableToUnavailable(book, userId, unavailableBooks);
            availableBooks = deleteBookFromArray(book, availableBooks);
            unavailableBooks[unavailableBooks.length - 1].setBorrowed(true);
            unavailableBooks[unavailableBooks.length - 1].setDueToDate(getReturnDateForBorrowedBook());
        }
    }

    @Override
    void returnBook(Book book) {
        if (isBookInUnavailableBooks(book)) {
            moveBookFromUnavailableToAvailable(book, availableBooks);
            unavailableBooks = deleteBookFromArray(book, unavailableBooks);
        }
    }

    @Override
    public Book findBookById(String id) {
        for (Book book1 : availableBooks) {
            if (book1.getId().equals(id)) {
                return book1;
            }
        }
        for (Book book1 : unavailableBooks) {
            if (book1.getId().equals(id)) {
                return book1;
            }
        }
        return null;
    }

    @Override
    void reserveBook(Book book, User userId) {
        if (isBookAvailable(book)) {
            moveBookFromAvailableToUnavailable(book, userId, unavailableBooks);
            availableBooks = deleteBookFromArray(book, availableBooks);
            unavailableBooks[unavailableBooks.length - 1].setReserved(true);
            unavailableBooks[unavailableBooks.length - 1].setDueToDate(getReturnDateForReservedBook());
        }
    }

    @Override
    void sendNotifications(Book book, User user) {
        System.out.println("Send notification to: " + user.getEmail());
        System.out.println("Hello, " + user.getName() + "!");
        System.out.println("We would like to kindly remind you, that " + book.getTitle() + " by " + book.getAuthor() + " borrowing period will end up in two days.");
        System.out.println("We would appreciate book return on time.");
        System.out.println("Thanks. Your favourite library.");
    }

    @Override
    void issuePenalty(Book book, User user) {
        user.setPenalty(10);
        System.out.println("Send notification to: " + user.getEmail());
        System.out.println("Hello, " + user.getName() + "!");
        System.out.println("We would like to kindly remind you, that " + book.getTitle() + " by " + book.getAuthor() + " is overdue.");
        System.out.println("We regret to inform that we forced to issue a penalty. Your current penalty is " + user.getPenalty() + " dollars.");
        System.out.println("We would appreciate book return on time. Your favourite library.");
    }

    private boolean isBookAvailable(Book book) {
        for (Book availableBook : availableBooks) {
            if (availableBook.getId().equals(book.getId())) {
                return true;
            }
        }
        return false;
    }

    private boolean isBookInUnavailableBooks(Book book) {
        for (Book unavailableBook : unavailableBooks) {
            if (unavailableBook.getId().equals(book.getId())) {
                return true;
            }
        }
        return false;
    }

    private void moveBookFromAvailableToUnavailable(Book book, User userId, Book[] unavailableBooks) {
        if (!isFirstUnavailableBook()) {
            this.unavailableBooks = extendUBookArray(unavailableBooks);
        }
        addUnavailableBook(book, userId);
    }

    private void moveBookFromUnavailableToAvailable(Book book, Book[] availableBooks) {
        if (!isFirstAvailableBook()) {
            this.availableBooks = extendUBookArray(availableBooks);
        }
        addBackAvailableBook(book);
    }

    private Book[] deleteBookFromArray(Book book, Book[] array) {
        deleteBookInfoFromArray(book, array);
        if (isFirstUnavailableBook()) {
            return array;
        }
        return deleteEmptyElement(array);
    }

    private void deleteBookInfoFromArray(Book book, Book[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(book)) {
                array[i] = null;
            }
        }
    }

    private Book[] deleteEmptyElement(Book[] array) {
        Book[] out = new Book[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (i < emptyElementIndex(array)) {
                out[i] = array[i];
            } else {
                out[i] = array[i + 1];
            }
        }
        return out;
    }

    private int emptyElementIndex(Book[] array) {
        int emptyElementIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                emptyElementIndex = i;
            }
        }
        return emptyElementIndex;
    }


    private boolean isFirstUnavailableBook() {
        return unavailableBooks[0] == null;
    }

    private boolean isFirstAvailableBook() {
        return availableBooks[0] == null;
    }

    private void addUnavailableBook(Book book, User userId) {
        String id = book.getId();
        String title = book.getTitle();
        String author = book.getAuthor();
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        Book book1 = new Book(id, title, author, false, false, userId, currentDate);
        unavailableBooks[unavailableBooks.length - 1] = book1;
    }

    private void addBackAvailableBook(Book book) {
        String id = book.getId();
        String title = book.getTitle();
        String author = book.getAuthor();
        Book book1 = new Book(id, title, author);
        availableBooks[availableBooks.length - 1] = book1;
    }

    private Book[] extendUBookArray(Book[] array) {
        Book[] out = new Book[array.length + 1];
        System.arraycopy(array, 0, out, 0, array.length);
        return out;
    }

    private Date getReturnDateForBorrowedBook() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 14); //borrowing period = 2 weeks
        return calendar.getTime();
    }

    private Date getReturnDateForReservedBook() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 2); //borrowing period = 2 days
        return calendar.getTime();
    }

}
