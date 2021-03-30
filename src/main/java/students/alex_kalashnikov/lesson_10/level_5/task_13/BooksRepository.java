package students.alex_kalashnikov.lesson_10.level_5.task_13;

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
    public boolean addBook(Book book) {
        if (repository == null) {
            saveFirstBook(book);
            return true;
        } else if (checkContains(book)) {
            saveBook(book);
            return true;
        }
        return false;
    }

}