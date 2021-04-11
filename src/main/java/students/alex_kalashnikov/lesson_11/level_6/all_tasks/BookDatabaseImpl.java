package students.alex_kalashnikov.lesson_11.level_6.all_tasks;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> repository = new ArrayList<>();
    private Long idCounter = 1L;

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
        boolean check = false;
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).equals(book)) {
                repository.remove(i);
                check = true;
                i--;
            }
        }
        return check;
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
                i--;
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < repository.size(); i++) {
            if (repository.get(i).getTitle().equals(title)) {
                repository.remove(repository.get(i));
                i--;
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

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> map = new HashMap<>();
        for (int i = 0; i < repository.size(); i++) {
            map.put(repository.get(i).getAuthor(), findByAuthor(repository.get(i).getAuthor()));
        }
        return map;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Set<Book> set = findUniqueBooks();
        List<Book> arr = new ArrayList<>(set);
        Map<String, List<Book>> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i).getAuthor(), findByAuthorUnique(arr.get(i).getAuthor(), arr));
        }
        Map<String, Integer> mapFinal = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            mapFinal.put(arr.get(i).getAuthor(), map.get(arr.get(i).getAuthor()).size());
        }
        return mapFinal;
    }

    private List<Book> findByAuthorUnique(String author, List<Book> arr) {
        List<Book> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getAuthor().equals(author)) {
                arr1.add(arr.get(i));
            }
        }
        return arr1;
    }

}