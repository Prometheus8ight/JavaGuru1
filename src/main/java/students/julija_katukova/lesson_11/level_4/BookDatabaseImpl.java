package students.julija_katukova.lesson_11.level_4;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {

    private final List<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {
        return saveBook(book);
    }

    @Override
    public boolean delete(Long bookId) {
        return deleteBook(bookId);
    }

    @Override
    public boolean delete(Book book) {
        return deleteBook(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return findBookById(bookId);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return findBooksByAuthor(author);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return findBooksByTitle(title);
    }

    @Override
    public int countAllBooks() {
        return countBooks();
    }

    @Override
    public void deleteByAuthor(String author) {
        deleteBookByAuthor(author);
    }

    @Override
    public void deleteByTitle(String title) {
        deleteBookByTitle(title);
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        return findBySearchCriteria(searchCriteria);
    }

    @Override
    public Set<String> findUniqueAuthors() {
        return findUniqueBooksAuthors();
    }

    @Override
    public Set<String> findUniqueTitles() {
        return findUniqueBooksTitles();
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return findAllUniqueBooks();
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }

    public List<Book> getBooks() {
        return books;
    }


    private Long saveBook(Book book) {
        long id = books.size();
        if (!IsBookAlreadyIn(book)) {
            id++;
            book.setId(id);
            books.add(book);
        }
        return id;
    }

    private boolean deleteBook(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }

        }
        return false;
    }

    private boolean deleteBook(Book book) {
        for (Book book1 : books) {
            if (book1.equals(book)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    private Optional<Book> findBookById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    private List<Book> findBooksByAuthor(String author) {
        List<Book> out = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                out.add(book);
            }
        }
        return out;
    }

    private List<Book> findBooksByTitle(String title) {
        List<Book> out = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                out.add(book);
            }
        }
        return out;
    }

    private int countBooks() {
        return books.size();
    }

    private void deleteBookByAuthor(String author) {
        books.removeIf(book -> book.getAuthor().equals(author));
    }

    private void deleteBookByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    private List<Book> findBySearchCriteria(SearchCriteria searchCriteria) {
        List<Book> out = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                out.add(book);
            }
        }
        return out;
    }

    private Set<String> findUniqueBooksAuthors() {
        Set<String> out = new HashSet<>();
        for (Book book : books) {
            out.add(book.getAuthor());
        }
        return out;
    }

    private Set<String> findUniqueBooksTitles() {
        Set<String> out = new HashSet<>();
        for (Book book : books) {
            out.add(book.getTitle());
        }
        return out;
    }

    private Set<Book> findAllUniqueBooks() {
        return new HashSet<>(books);
    }

    private boolean IsBookAlreadyIn(Book book) {
        for (Book book1 : books) {
            if (book1.equals(book)) {
                return true;
            }
        }
        return false;
    }
}