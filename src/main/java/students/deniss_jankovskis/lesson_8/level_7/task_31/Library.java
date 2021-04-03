package students.deniss_jankovskis.lesson_8.level_7.task_31;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Library {

    private Book[] books = new Book[15];


    String addBookInTheLibrary(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = createNewBook(title);
                books[i].setInLibrary(true);
                return "The book has been added!";
            }
        }
        return null;
    }

    private Book createNewBook(String title) {
        return new Book(title);
    }

    private boolean equals(Book book, String title) {
        return book.getTitle().toLowerCase(Locale.ROOT).equals(title.toLowerCase());
    }

    String takeBookFromLibrary(String title, String dateOfReturn) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(dateOfReturn, dateTimeFormatter);
        for (Book book : books) {
            if (book != null && equals(book, title) && book.isReserve()
                    || book != null && equals(book, title) && !book.InLibrary()) {
                return "The book is not available!";
            } else if (book != null && equals(book, title)) {
                book.setInLibrary(false);
                book.setDateOfReservation(LocalDateTime.now());
                book.setDateOfReturn(localDateTime);
            }
        }
        return "Please return the book: " + dateOfReturn() + ".";
    }

    String returnBookToLibrary(String title) {
        for (Book book : books) {
            if (book != null && equals(book, title)) {
                if (LocalDateTime.now().isAfter(book.getDateOfReturn())) {
                    book.setPenalty(5);
                    return "You are late for return of the book, your penalty will be: " + book.getPenalty();
                } else {
                    penalty(title);
                }
            }
        }
        return "Thank you for returning! Have a nice day!";
    }

    private void penalty(String title) {
        for (Book book : books) {
            if (book != null && equals(book, title)) {
                book.setInLibrary(true);
                book.setDateOfReservation(null);
                book.setDateOfReturn(null);
                book.setPenalty(0);
            }
        }
    }

    String payForThePenalty(String title, int payment) {
        for (Book book : books) {
            if (book != null) {
                if (equals(book, title) && !book.InLibrary()) {
                    if (payment == book.getPenalty()) {
                        penalty(title);
                        return "Thank you for the payment!";
                    }
                }
            }
        }
        return "The book is not available!";
    }

    String bookReservation(String title) {
        for (Book book : books) {
            if (book != null && equals(book, title) && book.InLibrary() && !book.isReserve()) {
                book.setReserve(true);
                return "Your book has been reserved!";
            }
        }
        return "The book is not available!";
    }

    private int takenBooks() {
        int counter = 0;
        for (Book book : books) {
            if (book != null && book.getDateOfReturn() != null) {
                counter++;
            }
        }
        return counter;
    }

    String[] dateOfReturn() {
        String[] takenBooks = new String[takenBooks()];
        int i = 0;
        for (Book book : books) {
            if (book != null && book.getDateOfReturn() != null) {
                takenBooks[i] = "The book: " + book.getTitle() + ". Please return the book: " + book.getDateOfReturn() + ".";
                i++;
            }
        }
        return takenBooks;
    }

    String deleteBookFromLibrary(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && equals(books[i], title)) {
                books[i] = null;
                return "The book is not available!";
            }
        }
        return "The book is not in library!";
    }

    String checkBook(String title) {
        for (Book book : books) {
            if (book != null && equals(book, title)) {
                return book.getTitle() + " " + book.getDateOfReturn() + " " + book.getPenalty();
            }
        }
        return "The book is not available!";
    }

    private int findAllBooks() {
        int counter = 0;
        for (Book book : books) {
            if (book != null) {
                counter++;
            }
        }
        return counter;
    }

    Book[] checkAllBooks() {
        Book[] allBooks = new Book[findAllBooks()];
        int i = 0;
        for (Book book : books) {
            if (book != null) {
                allBooks[i] = book;
                i++;
            }
        }
        return allBooks;
    }

}
