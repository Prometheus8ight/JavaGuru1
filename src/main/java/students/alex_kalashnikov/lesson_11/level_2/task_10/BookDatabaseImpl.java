package students.alex_kalashnikov.lesson_11.level_2.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    List<Book> repository = new ArrayList<>();
    Long idCounter = 1L;

    @Override
    public Long save(Book book) {
        book.setId(idCounter);
        repository.add(book);
        idCounter++;
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getId().equals(bookId)) {
                repository.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).equals(book)) {
                repository.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getId().equals(bookId)) {
                return Optional.of(repository.get(i));
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> arr = new ArrayList<>();
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getAuthor().equals(author)) {
                arr.add(repository.get(i));
            }
        }
        return arr;
    }

}