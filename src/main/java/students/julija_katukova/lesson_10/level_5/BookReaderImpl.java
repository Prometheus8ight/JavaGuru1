package students.julija_katukova.lesson_10.level_5;


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
        return findBooks(author);
    }

    private boolean addNewBookToArray(Book book) {
        if (validate(book, books)) {
            this.books = extendUBookArray(books);
            push(book);
            return true;
        }
        return false;
    }

    private boolean validate(Book book, Book[] books) {
        return bookValidator.validate(book, books);
    }

    private Book[] extendUBookArray(Book[] books) {
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
        int emptyElementIndex = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                emptyElementIndex = i;
            }
        }
        return emptyElementIndex;
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


