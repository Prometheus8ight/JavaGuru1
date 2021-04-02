package students.alex_kalashnikov.lesson_10.level_5.task_18;

class BooksRepository implements BookReader {

    private Book[] repository;
    private int count;

    public Book[] getRepository() {
        return repository;
    }

    private Book[] createArr(int count) {
        return new Book[count];
    }

    private void saveFirstBook(Book book) {
        count++;
        repository = createArr(count);
        repository[repository.length - 1] = book;
    }

    private void saveBook(Book book) {
        count++;
        Book[] arr = createArr(count);
        for (int i = 0; i < repository.length; i++) {
            arr[i] = repository[i];
        }
        repository = arr;
        repository[repository.length - 1] = book;
    }

    private void removeBook(Book book) {
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

    @Override
    public boolean checkContains(Book book) {
        if (repository == null) {
            return true;
        } else {
            for (Book value : repository) {
                if (value.equals(book)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean checkParameters(Book book) {
        return !book.getName().equals("") && !book.getAuthor().equals("");
    }

    @Override
    public boolean addBook(Book book) {
        if (repository == null && checkParameters(book)) {
            saveFirstBook(book);
            return true;
        } else if (checkContains(book) && checkParameters(book)) {
            saveBook(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        if (repository == null || checkContains(book)) {
            return false;
        } else {
            removeBook(book);
            return true;
        }
    }

    @Override
    public String[] findAllBooks() {
        if (repository != null) {
            String[] arr = new String[repository.length];
            for (int i = 0; i < repository.length; i++) {
                arr[i] = repository[i].getName() + " [" + repository[i].getAuthor() + "]";
            }
            return arr;
        } else {
            return new String[]{};
        }
    }

    @Override
    public String[] findBooksByAuthor(String author) {
        int counter = 0;
        int counter1 = 0;
        if (repository == null) {
            return new String[]{};
        } else {
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
    public String[] findBooksByLetters(String word) {
        int counter = 0;
        int counter1 = 0;
        if (repository == null) {
            return new String[]{};
        } else {
            for (Book book : repository) {
                if (compareLetters(splitWords(word), splitWords(book.getAuthor()))) {
                    counter++;
                }
            }
            String[] arr = new String[counter];
            for (Book book : repository) {
                if (splitWords(word).length > splitWords(book.getAuthor()).length + 1) {
                    return new String[]{};
                } else if (compareLetters(splitWords(word), splitWords(book.getAuthor()))) {
                    arr[counter1] = book.getName() + " [" + book.getAuthor() + "]";
                    counter1++;
                }
            }
            return arr;
        }
    }

}