package students.julija_katukova.lesson_10.level_6;

class BookValidation {

    boolean validate(Book book, Book[] books) {
        if (books[0] == null) {
            return bookHasTitleAndAuthorForFirstBook(book);
        } else {
            return !bookIsIn(book, books) && bookHasTitleAndAuthor(book);
        }
    }

    boolean bookIsIn(Book book, Book[] books) {
        for (Book book1 : books) {
            if (book1.equals(book)) {
                return true;
            }
        }
        return false;
    }

    boolean bookHasTitleAndAuthorForFirstBook(Book book) {
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

    boolean bookHasTitleAndAuthor(Book book) {
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