package students.alex_kalashnikov.lesson_10.level_6.task_22;

class BooksRepository implements BookReader {

    private Book[] repository = {};
    private int count;

    public Book[] getRepository() {
        return repository;
    }

    private Book[] createArr(int count) {
        return new Book[count];
    }

    private void save(Book book) {
        count++;
        Book[] arr = createArr(count);
        for (int i = 0; i < repository.length; i++) {
            arr[i] = repository[i];
        }
        repository = arr;
        repository[repository.length - 1] = book;
    }

    private void remove(Book book) {
        count--;
        Book[] arr = createArr(count);
        for (int i = 0; i < repository.length; i++) {
            if (repository[i].equals(book)) {
                repository[i] = null;
            }
        }
        int count1 = 0;
        for (Book value : repository) {
            if (value == null) {
                continue;
            } else {
                arr[count1] = value;
                count1++;
            }
        }
        repository = arr;
    }

    private boolean contains(Book book) {
        for (Book value : repository) {
            if (value.equals(book)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkParameters(Book book) {
        return !book.getName().equals("") && !book.getAuthor().equals("");
    }

    @Override
    public boolean add(Book book) {
        if (contains(book) && checkParameters(book)) {
            save(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (contains(book)) {
            return false;
        } else {
            remove(book);
            return true;
        }
    }

    @Override
    public String[] findAll() {
        String[] arr = new String[repository.length];
        for (int i = 0; i < repository.length; i++) {
            arr[i] = repository[i].getName() + " [" + repository[i].getAuthor() + "]";
        }
        return arr;
    }

    @Override
    public String[] findByAuthor(String author) {
        int counter = 0;
        int counter1 = 0;
        for (Book book : repository) {
            if (book.getAuthor().equals(author)) {
                counter++;
            }
        }
        String[] arr = new String[counter];
        for (Book book : repository) {
            if (book.getAuthor().equals(author)) {
                arr[counter1] = book.getName() + " [" + book.getAuthor() + "]";
                counter1++;
            }
        }
        return arr;
    }

    private String[] splitWords(String searchWord) {
        String lowerCase = searchWord.toLowerCase();
        return lowerCase.split("");
    }

    private boolean compareLetters(String[] searchWord, String[] index) {
        int counter = 0;
        for (int i = 0; i < searchWord.length; i++) {
            if (searchWord.length > index.length) {
                return false;
            } else if (searchWord[i].equals(index[i])) {
                counter++;
            }
        }
        return counter == searchWord.length;
    }

    @Override
    public String[] findByAuthorLetters(String word) {
        int counter = 0;
        int counter1 = 0;
        for (Book book : repository) {
            if (compareLetters(splitWords(word), splitWords(book.getAuthor()))) {
                counter++;
            }
        }
        String[] arr = new String[counter];
        for (Book book : repository) {
            if (compareLetters(splitWords(word), splitWords(book.getAuthor()))) {
                arr[counter1] = book.getName() + " [" + book.getAuthor() + "]";
                counter1++;
            }
        }
        return arr;
    }

    private String convertToLowerCase(String name) {
        return name.toLowerCase();
    }

    @Override
    public String[] findByName(String name) {
        int counter = 0;
        int counter1 = 0;
        for (Book book : repository) {
            if (convertToLowerCase(book.getName()).equals(convertToLowerCase(name))) {
                counter++;
            }
        }
        String[] arr = new String[counter];
        for (Book book : repository) {
            if (convertToLowerCase(book.getName()).equals(convertToLowerCase(name))) {
                arr[counter1] = book.getName() + " [" + book.getAuthor() + "]";
                counter1++;
            }
        }
        return arr;
    }

    @Override
    public String[] findByNameLetters(String word) {
        int counter = 0;
        int counter1 = 0;
        for (Book book : repository) {
            if (compareLetters(splitWords(word), splitWords(book.getName()))) {
                counter++;
            }
        }
        String[] arr = new String[counter];
        for (Book book : repository) {
            if (compareLetters(splitWords(word), splitWords(book.getName()))) {
                arr[counter1] = book.getName() + " [" + book.getAuthor() + "]";
                counter1++;
            }
        }
        return arr;
    }

    private int findBookIndex(Book book) {
        for (int i = 0; i < repository.length; i++) {
            if (repository[i].equals(book)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean markAsRead(Book book) {
        if (repository == null) {
            return false;
        } else if (!contains(book)) {
            repository[findBookIndex(book)].setBookIsRead(true);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean markAsNotRead(Book book) {
        if (repository == null) {
            return false;
        } else if (!contains(book)) {
            repository[findBookIndex(book)].setBookIsRead(false);
            return true;
        } else {
            return false;
        }
    }

}