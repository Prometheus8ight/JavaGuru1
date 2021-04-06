package students.alex_kalashnikov.lesson_10.level_5.task_13;

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

    private boolean contains(Book book) {
        for (Book value : repository) {
            if (value.equals(book)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean add(Book book) {
        if (contains(book)) {
            save(book);
            return true;
        }
        return false;
    }

}