package students.julija_katukova.lesson_10.level_6;

import java.util.Arrays;

class BookReaderImpl implements BookReader {

    private Book[] books = new Book[0];
    private BookValidator bookValidator = new BookValidator();

    public BookReaderImpl() {
        BookValidator bookValidator = new BookValidator();
    }

    @Override
    public boolean add(Book book) {
        return addNewBookToArray(book);
    }

    @Override
    public boolean delete(Book book) {
        return deleteBookFromArray(book);
    }

    @Override
    public Book[] findAll() {
        return books;
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
    public Book[] findAllReadBooks() {
        return findAllReadBooksAsStringArray();
    }

    @Override
    public Book[] findAllUnreadBooks() {
        return findAllUnreadBooksAsStringArray();
    }


    private boolean addNewBookToArray(Book book) {
        if (validate(book, books)) {
            this.books = extendBookArray(books);
            push(book);
            return true;
        }
        return false;
    }

    private boolean validate(Book book, Book[] books) {
        return bookValidator.validate(book, books);
    }

    private Book[] extendBookArray(Book[] books) {
        Book[] out = new Book[books.length + 1];
        System.arraycopy(books, 0, out, 0, books.length);
        return out;
    }

    private void push(Book book) {
        books[books.length - 1] = book;
    }

    private boolean deleteBookFromArray(Book book) {
        if (bookValidator.bookIsIn(book, books)) {
            deleteBookInfoFromArray(book);
            this.books = deleteEmptyElement(books);
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
            if (i < lastEmptyIndex()) {
                out[i] = array[i];
            } else {
                out[i] = array[i + 1];
            }
        }
        return out;
    }

    private int lastEmptyIndex() {
        int emptyElementIndex = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                emptyElementIndex = i;
            }
        }
        return emptyElementIndex;
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
        BookValidator bookValidator = new BookValidator();
        if (bookValidator.bookIsIn(book, books)) {
            book.setMarkAsRead(true);
            return true;
        }
        return false;
    }

    private boolean markAsUnread(Book book) {
        BookValidator bookValidator = new BookValidator();
        if (bookValidator.bookIsIn(book, books)) {
            book.setMarkAsUnread(true);
            return true;
        }
        return false;
    }

    private Book[] findAllReadBooksAsStringArray() {
        Book[] out = new Book[0];
        int i = 0;
        for (Book book : books) {
            if (book.isMarkAsRead()) {
                out = extendBookArray(out);
                out[i] = book;
                i++;
            }
        }
        return out;
    }

    private Book[] findAllUnreadBooksAsStringArray() {
        Book[] out = new Book[0];
        int i = 0;
        for (Book book : books) {
            if (book.isMarkAsUnread()) {
                out = extendBookArray(out);
                out[i] = book;
                i++;
            }
        }
        return out;
    }
}