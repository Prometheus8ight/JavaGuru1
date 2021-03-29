package students.vitaly_porsev.lesson_10.level_5.allTasks;

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
    public String[] findBooksByAuthor(String author) {
        String[] authorArray = new String[checkAuthorBooks(author)];
        int counter = 0;
        for (int i = 0; i < library.length; i++) {
            if (library[i].getAuthor().equals(author)) {
                authorArray[counter] = String.valueOf(library[i]);
                counter++;
            }
        }
        return authorArray;
    }

    private int checkAuthorBooks(String author) {
        int counter = 0;
        for (Book book : library) {
            if (book.getAuthor().equals(author)) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String[] findBooksByWord(String word) {
        int authorCounter = 0;
        String[] authorArray = new String[findEqualWords(word)];
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

    private int findEqualWords(String word) {
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
    public String[] findAllBooks() {
        String[] libraryArray = new String[library.length];
        for (int i = 0; i < libraryArray.length; i++) {
            libraryArray[i] = String.valueOf(library[i]);
        }
        return libraryArray;
    }
}
