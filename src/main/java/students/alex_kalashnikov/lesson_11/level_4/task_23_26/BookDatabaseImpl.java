package students.alex_kalashnikov.lesson_11.level_4.task_23_26;

import java.util.*;

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

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> arr = new ArrayList<>();
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getTitle().equals(title)) {
                arr.add(repository.get(i));
            }
        }
        return arr;
    }

    @Override
    public int countAllBooks() {
        return repository.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getAuthor().equals(author)) {
                repository.remove(repository.get(i));
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getTitle().equals(title)) {
                repository.remove(repository.get(i));
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> arr = new ArrayList<>();
        for (int i = 0; i < repository.size(); i++) {
            if (searchCriteria.match(repository.get(i))) {
                arr.add(repository.get(i));
            }
        }
        return arr;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < repository.size(); i++) {
            set.add(repository.get(i).getAuthor());
        }
        return set;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < repository.size(); i++) {
            set.add(repository.get(i).getTitle());
        }
        return set;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> set = new HashSet<>();
        for (int i = 0; i < repository.size(); i++) {
            set.add(repository.get(i));
        }
        return set;
    }

    @Override
    public boolean contains(Book book) {
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).equals(book)) {
                return true;
            }
        }
        return false;
    }

}