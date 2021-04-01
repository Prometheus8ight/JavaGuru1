package students.deniss_jankovskis.lesson_10.level_6;

class BookReaderImpl implements BookReader {

    private Book[] books = new Book[1];

    @Override
    public boolean addBook(Book book) {
        return addBookInArray(book);
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
    public Book[] findBookByAuthor(String author) {
        return findBookAuthor(author);
    }

    @Override
    public Book[] findBooksByTitle(String title) {
        return findBookTitle(title);
    }

    @Override
    public boolean readBook(Book book) {
        return markReadBook(book);
    }

    @Override
    public boolean unreadBook(Book book) {
        return markUnreadBook(book);
    }

    @Override
    public String[] findAllReadBooks() {
        return findAllReadBooksAsStringArray();
    }

    @Override
    public String[] findAllUnreadBooks() {
        return findAllUnreadBooksAsStringArray();
    }

    private boolean firstBook() {
        return books[0] == null;
    }

    private boolean validate(Book book, Book[] books) {
        BookValidator bookValidation = new BookValidator();
        return bookValidation.validate(book, books);
    }

    private void addBookInfoInArray(Book book) {
        books[books.length - 1] = book;
    }

    private boolean addBookInArray(Book book) {
        if (firstBook()) {
            if (validate(book, books)) {
                addBookInfoInArray(book);
                return true;
            }
        } else {
            if (validate(book, books)) {
                this.books = extendBookArray(books);
                addBookInfoInArray(book);
                return true;
            }
        }
        return false;
    }

    private Book[] extendBookArray(Book[] books) {
        Book[] newArray = new Book[books.length + 1];
        for (int i = 0; i < books.length; ++i) {
            newArray[i] = books[i];
        }
        books = newArray;

        return newArray;
    }

    private String[] extendStringArray(String[] books) {
        String[] newArray = new String[books.length + 1];
        for (int i = 0; i < books.length; ++i) {
            newArray[i] = books[i];
        }
        books = newArray;

        return newArray;
    }

    private boolean deleteBookFromArray(Book book) {
        BookValidator bookValidator = new BookValidator();
        if (bookValidator.bookAdded(book, books)) {
            deleteBookInfoFromArray(book);
            if (!firstBook()) {
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
            if (i < emptyElement()) {
                out[i] = array[i];
            } else {
                out[i] = array[i + 1];
            }
        }
        return out;
    }

    private int emptyElement() {
        int emptyElement = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                emptyElement = i;
            }
        }
        return emptyElement;
    }

    private String[] findAllBooksAsStringArray() {
        String[] out = new String[books.length];
        int i = 0;
        for (Book book : books) {
            out[i] = book.getTitle() + " " + book.getAuthor() + " ";
            i++;

        }
        return out;
    }

    private Book[] findBookAuthor(String author) {
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

    private Book[] findBookTitle(String title) {
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

    private boolean markReadBook(Book book) {
        BookValidator bookValidator = new BookValidator();
        if (bookValidator.bookAdded(book, books)) {
            book.setMarkReadBook(true);
            return true;
        }
        return false;
    }

    private boolean markUnreadBook(Book book) {
        BookValidator bookValidator = new BookValidator();
        if (bookValidator.bookAdded(book, books)) {
            book.setMarkUnreadBook(true);
            return true;
        }
        return false;
    }

    private String[] findAllReadBooksAsStringArray() {
        String[] out = new String[0];
        int i = 0;
        for (Book book : books) {
            if (book.markReadBook()) {
                out = extendStringArray(out);
                out[i] = book.getTitle() + ", [" + book.getAuthor() + "]";
                i++;
            }
        }
        return out;
    }

    private String[] findAllUnreadBooksAsStringArray() {
        String[] out = new String[0];
        int i = 0;
        for (Book book : books) {
            if (book.markUnreadBook()) {
                out = extendStringArray(out);
                out[i] = book.getTitle() + " [" + book.getAuthor() + "]";
                i++;
            }
        }
        return out;
    }
}
