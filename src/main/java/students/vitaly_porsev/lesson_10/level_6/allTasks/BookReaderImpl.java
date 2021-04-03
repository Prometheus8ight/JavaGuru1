package students.vitaly_porsev.lesson_10.level_6.allTasks;

class BookReaderImpl implements BookReader {

    private Book[] library = new Book[0];

    @Override
    public boolean addBookToTheLibrary(String title, String author) {
        for (Book booksInLibrary : library) {
            if (title.equals(booksInLibrary.getTitle())
                    && author.equals(booksInLibrary.getAuthor())) {
                return false;
            }
        }
        if (checkTitleAndAuthorOnEmptiness(title, author)) {
            return false;
        }
        library = copyArrayAndMakeNewLength();
        library[library.length - 1] = createNewBook(title, author);
        return true;
    }

    private boolean checkTitleAndAuthorOnEmptiness(String title, String author) {
        return title.isEmpty() && author.isEmpty() || title.isEmpty() || author.isEmpty();
    }

    private Book[] copyArrayAndMakeNewLength() {
        Book[] newLibrary = new Book[library.length + 1];
        if (library.length == 0) {
            return newLibrary;
        } else {
            for (int i = 0; i < library.length; i++) {
                newLibrary[i] = library[i];
            }
        }
        return newLibrary;
    }

    private Book createNewBook(String title, String author) {
        return new Book(title, author);
    }

    @Override
    public boolean deleteBookByTitle(String title) {
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                library = deleteBookAndMakeNewLength(title);
                return true;
            }
        }
        return false;
    }

    private Book[] deleteBookAndMakeNewLength(String title) {
        Book[] newLibrary = new Book[library.length - 1];
        for (int i = 0; i < newLibrary.length; i++) {
            if (title.equals(library[i].getTitle())) {
                for (int j = i; j < newLibrary.length; j++) {
                    newLibrary[j] = library[j + 1];
                }
                return newLibrary;
            }
            newLibrary[i] = library[i];
        }
        return newLibrary;
    }

    @Override
    public String[] findBooksByEqualTitle(String title) {
        String[] titleArray = new String[checkEqualTitlesInBooks(title)];
        int counter = 0;
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                titleArray[counter] = String.valueOf(book);
                counter++;
            }
        }
        return titleArray;
    }

    private int checkEqualTitlesInBooks(String title) {
        int counter = 0;
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String[] findBooksWithEqualAuthor(String author) {
        String[] authorArray = new String[checkEqualAuthorBooks(author)];
        int counter = 0;
        for (int i = 0; i < library.length; i++) {
            if (library[i].getAuthor().equals(author)) {
                authorArray[counter] = String.valueOf(library[i]);
                counter++;
            }
        }
        return authorArray;
    }

    private int checkEqualAuthorBooks(String author) {
        int counter = 0;
        for (Book book : library) {
            if (book.getAuthor().equals(author)) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String[] findBooksWithEqualWordsInTitle(String word) {
        int titleCounter = 0;
        String[] titleArray = new String[findEqualWordsInTitles(word)];
        for (Book book : library) {
            String[] w = book.getTitle().split(" ");
            for (String s : w) {
                if (word.equals(s)) {
                    titleArray[titleCounter] = String.valueOf(book);
                    titleCounter++;
                }
            }
        }
        return titleArray;
    }

    private int findEqualWordsInTitles(String word) {
        int counter = 0;
        for (Book book : library) {
            String[] w = book.getTitle().split(" ");
            for (String s : w) {
                if (word.equals(s)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    @Override
    public String[] findBooksWithEqualAuthorsNameOrSurname(String word) {
        int authorCounter = 0;
        String[] authorArray = new String[findEqualAuthorsNameOrSurname(word)];
        for (Book book : library) {
            String[] w = book.getAuthor().split(" ");
            for (String s : w) {
                if (word.equals(s)) {
                    authorArray[authorCounter] = String.valueOf(book);
                    authorCounter++;
                }
            }
        }
        return authorArray;
    }

    private int findEqualAuthorsNameOrSurname(String word) {
        int counter = 0;
        for (Book book : library) {
            String[] w = book.getAuthor().split(" ");
            for (String s : w) {
                if (word.equals(s)) {
                    counter++;
                }
            }
        }
        return counter;
    }


    @Override
    public boolean readBook(String title) {
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                book.setReadBook(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean unreadBook(String title) {
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                book.setReadBook(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] findReadBooks() {
        int counter = 0;
        String[] readBooksArray = new String[howMuchReadBooks()];
        for (Book book : library) {
            if (book.isReadBook()) {
                readBooksArray[counter] = String.valueOf(book);
                counter++;
            }
        }
        return readBooksArray;
    }

    private int howMuchReadBooks() {
        int counter = 0;
        for (Book book : library) {
            if (book.isReadBook()) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String[] findUnreadBooks() {
        int counter = 0;
        String[] unreadBooksArray = new String[howMuchUnreadBooks()];
        for (Book book : library) {
            if (!book.isReadBook()) {
                unreadBooksArray[counter] = String.valueOf(book);
                counter++;
            }
        }
        return unreadBooksArray;
    }

    private int howMuchUnreadBooks() {
        int counter = 0;
        for (Book book : library) {
            if (!book.isReadBook()) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String[] findAllBooks() {
        String[] libraryArray = new String[library.length];
        for (int i = 0; i < libraryArray.length; i++) {
            libraryArray[i] = String.valueOf(library[i]);
        }
        return libraryArray;
    }

    public Book[] getLibrary() {
        return library;
    }
}
