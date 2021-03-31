package students.deniss_jankovskis.lesson_10.level_5;

public class BookValidator {


    boolean validate(Book book, Book[] books) {
        if (books[0] == null) {
            return bookWithTitleAndAuthor(book);
        } else {
            return !bookAdded(book, books) && bookWithTitleAndAuthor2(book);
        }
    }

    boolean bookAdded(Book book, Book[] books) {
        for (Book book1 : books) {
            if (book1.equals(book)) {
                return true;
            }
        }
        return false;
    }

    boolean bookWithTitleAndAuthor(Book book) {
        if (!book.getTitle().equals("null") &&
                !book.getTitle().equals("-") &&
                !book.getTitle().equals("") &&
                !book.getTitle().equals(" ")) {
            return !book.getAuthor().equals("null") &&
                    !book.getAuthor().equals("-") &&
                    !book.getTitle().equals("") &&
                    !book.getAuthor().equals(" ");
        } else {
            return false;
        }
    }

    boolean bookWithTitleAndAuthor2(Book book) {
        if (book.getTitle() != null &&
                !book.getTitle().equals("null") &&
                !book.getTitle().equals("-") &&
                !book.getTitle().equals("") &&
                !book.getTitle().equals(" ")) {
            return book.getAuthor() != null &&
                    !book.getAuthor().equals("null") &&
                    !book.getAuthor().equals("-") &&
                    !book.getTitle().equals("") &&
                    !book.getAuthor().equals(" ");
        } else {
            return false;
        }
    }
}
