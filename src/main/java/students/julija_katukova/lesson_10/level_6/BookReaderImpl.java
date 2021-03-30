package students.julija_katukova.lesson_10.level_6;

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
        return findAllBooksAsStringArray();
    }

    @Override
    public Book[] findBooksByAuthor(String author) {
        return findBooksAuthor(author);
    }

    @Override
    public Book[] findBooksByTitle(String title) {
        return findBooksTitle(title);
    }

    @Override
    public boolean wasRead(Book book) {
        return markAsRead(book);
    }

    @Override
    public boolean wasUnread(Book book) {
        return markAsUnread(book);
    }

    @Override
    public String[] findAllReadBooks() {
        return findAllReadBooksAsStringArray();
    }

    @Override
    public String[] findAllUnreadBooks() {
        return findAllUnreadBooksAsStringArray();
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
                this.books = extendBookArray(books);
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

    private Book[] extendBookArray(Book[] books) {
        Book[] out = new Book[books.length + 1];
        System.arraycopy(books, 0, out, 0, books.length);
        return out;
    }

    private String[] extendStringArray(String[] books) {
        String[] out = new String[books.length + 1];
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

    private String[] findAllBooksAsStringArray() {
        String[] out = new String[books.length];
        int i = 0;
        for (Book book : books) {
            out[i] = book.getTitle() + " [" + book.getAuthor() + "]";
            i++;

        }
        return out;
    }

    private Book[] findBooksAuthor(String author) {
        Book[] out = new Book[0];
        String firstLetters;
        for (Book book : books) {
            int shorterLength = Math.min(book.getAuthor().length(), author.length());
            firstLetters = book.getAuthor().substring(0, shorterLength);
            if (firstLetters.equals(author)) {
                out = extendBookArray(out);
                out[out.length - 1] = book;
            }
        }
        return out;
    }

    private Book[] findBooksTitle(String title) {
        Book[] out = new Book[0];
        String firstLetters;
        for (Book book : books) {
            int shorterLength = Math.min(book.getTitle().length(), title.length());
            firstLetters = book.getTitle().substring(0, shorterLength);
            if (firstLetters.equals(title)) {
                out = extendBookArray(out);
                out[out.length - 1] = book;
            }
        }
        return out;
    }

    private boolean markAsRead(Book book) {
        BookValidation bookValidation = new BookValidation();
        if (bookValidation.bookIsIn(book, books)) {
            book.setMarkAsRead(true);
            return true;
        }
        return false;
    }

    private boolean markAsUnread(Book book) {
        BookValidation bookValidation = new BookValidation();
        if (bookValidation.bookIsIn(book, books)) {
            book.setMarkAsUnread(true);
            return true;
        }
        return false;
    }

    private String[] findAllReadBooksAsStringArray() {
        String[] out = new String[0];
        int i = 0;
        for (Book book : books) {
            if (book.isMarkAsRead()) {
                out = extendStringArray(out);
                out[i] = book.getTitle() + " [" + book.getAuthor() + "]";
                i++;
            }
        }
        return out;
    }

    private String[] findAllUnreadBooksAsStringArray() {
        String[] out = new String[0];
        int i = 0;
        for (Book book : books) {
            if (book.isMarkAsUnread()) {
                out = extendStringArray(out);
                out[i] = book.getTitle() + " [" + book.getAuthor() + "]";
                i++;
            }
        }
        return out;
    }
}