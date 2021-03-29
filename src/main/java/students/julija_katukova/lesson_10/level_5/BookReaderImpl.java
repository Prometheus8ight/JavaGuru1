package students.julija_katukova.lesson_10.level_5;

import java.util.Arrays;

class BookReaderImpl implements BookReader {

    private Book[] books = new Book[1];

    @Override
    public boolean addNewBook(Book book) {
        return addNewBookToArray(book);
    }

    @Override
    public boolean deleteBook(Book book) {
        return deleteBookFromArray(book);
    }

    @Override
    public String[] findAllBooks() {
        return convertBookArrayToStringArray();
    }

    @Override
    public Book[] findBooksByAuthor(String author) {
        return findBooks(author);
    }

    @Override
    public String toString() {
        return "BookReaderImpl{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    private boolean addNewBookToArray(Book book) {
        if (isFirstBook()) {
            if (validate(book, books)) {
                addNewBookInfoToArray(book);
                return true;
            }
        } else {
            if (validate(book, books)) {
                this.books = extendUBookArray(books);
                addNewBookInfoToArray(book);
                return true;
            }
        }
        return false;
    }

    private boolean validate(Book book, Book[] books) {
        BookValidation bookValidation = new BookValidation();
        return bookValidation.validate(book, books);
    }

    private boolean isFirstBook() {
        return books[0] == null;
    }

    private Book[] extendUBookArray(Book[] books) {
        Book[] out = new Book[books.length + 1];
        System.arraycopy(books, 0, out, 0, books.length);
        return out;
    }

    private void addNewBookInfoToArray(Book book) {
        books[books.length - 1] = book;
    }

    private boolean deleteBookFromArray(Book book) {
        BookValidation bookValidation = new BookValidation();
        if (bookValidation.bookIsIn(book, books)) {
            deleteBookInfoFromArray(book);
            if (!isFirstBook()) {
                this.books = deleteEmptyElement(books);
            }
            return true;
        }
        return false;
    }

    private void deleteBookInfoFromArray(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                books[i] = null;
            }
        }
    }

    private Book[] deleteEmptyElement(Book[] array) {
        Book[] out = new Book[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (i < emptyElementIndex()) {
                out[i] = array[i];
            } else {
                out[i] = array[i + 1];
            }
        }
        return out;
    }

    private int emptyElementIndex() {
        int emptyElementIndex = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                emptyElementIndex = i;
            }
        }
        return emptyElementIndex;
    }

    private String[] convertBookArrayToStringArray() {
        String[] out = new String[books.length];
        int i = 0;
        for (Book book : books) {
            out[i] = book.getTitle() + " [" + book.getAuthor() + "]";
            i++;

        }
        return out;
    }

    private Book[] findBooks(String author) {
        Book[] out = new Book[0];
        String firstLetters;
        for (Book book : books) {
            int shorterLength = Math.min(book.getAuthor().length(), author.length());
            firstLetters = book.getAuthor().substring(0, shorterLength);
            if (firstLetters.equals(author)) {
                out = extendUBookArray(out);
                out[out.length - 1] = book;
            }
        }
        return out;
    }

}


