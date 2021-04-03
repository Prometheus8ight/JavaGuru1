package students.alex_kalashnikov.lesson_10.level_5.task_15;

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

}