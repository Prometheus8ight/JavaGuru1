package students.alex_kalashnikov.lesson_10.level_5.task_15;

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

}