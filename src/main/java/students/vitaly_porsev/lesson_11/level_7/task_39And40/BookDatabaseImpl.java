package students.vitaly_porsev.lesson_11.level_7.task_39And40;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    private List<Book> library = new ArrayList<>();
    private Long idCounter = 0L;

    @Override
    public Long save(Book book) {
        idCounter++;
        book.setId(idCounter);
        library.add(book);
        return book.getId();
    }

    @Override
    public boolean deleteByID(Long bookId) {
        return library.removeIf(book -> bookId.equals(book.getId()));
    }

    @Override
    public boolean deleteObject(Book book) {
        return library.removeIf(books -> books.equals(book));
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : library) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> newLibrary = new ArrayList<>();
        for (Book book : library) {
            if (book.getAuthor().equals(author)) {
                newLibrary.add(book);
            }
        }
        return newLibrary;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> newLibrary = new ArrayList<>();
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                newLibrary.add(book);
            }
        }
        return newLibrary;
    }

    @Override
    public int countAllBooks() {
        return library.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        library.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        library.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public List findByCriteria(SearchCriteria searchCriteria) {
        List<Book> newLibrary = new LinkedList<>();
        for (Book book : library) {
            if (searchCriteria.match(book)) {
                newLibrary.add(book);
            }
        }
            return newLibrary;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authors = new HashSet<>();
        for (Book book : library) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> title = new HashSet<>();
        for (Book book : library) {
            title.add(book.getTitle());
        }
        return title;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> book = new HashSet<>(library);
        return book;
    }

    @Override
    public boolean contains(Book book) {
        for (Book bk : library) {
            if (bk.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Set<String> findUniqueWords(String text) {
        String[] splitText = text.toLowerCase().split("[, . '?]+");
        Set<String> textArray = new HashSet<>(Arrays.asList(splitText));
        return textArray;
    }

    @Override
    public Map<String, List<Book>> getAuthorBooksToMap() {
        Map<String, List<Book>> hashMAp = new HashMap<>();
        for (Book book : library) {
            hashMAp.put(book.getAuthor(), authorsBooks(book.getAuthor()));
        }
        return hashMAp;
    }

    private List<Book> authorsBooks(String author) {
        List<Book> authorBooks = new LinkedList<>();
        for (Book book : library) {
            if (book.getAuthor().equals(author)) {
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> hashMAp = new HashMap<>();
        for (Book book : library) {
            hashMAp.put(book.getAuthor(), countAuthorBooks(book.getAuthor()));
        }
        return hashMAp;
    }

    private int countAuthorBooks(String author) {
        int counter = 0;
        for (Book book : library) {
            if (book.getAuthor().equals(author)) {
                counter++;
            }
        }
        return counter;
    }

    public List<Book> getLibrary() {
        return library;
    }
}
