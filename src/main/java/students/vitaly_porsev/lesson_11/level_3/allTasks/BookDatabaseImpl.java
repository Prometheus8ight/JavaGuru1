package students.vitaly_porsev.lesson_11.level_3.allTasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

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
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> newLibrary = new LinkedList<>();
        for (Book book : library) {
            if (searchCriteria.match(book)) {
                newLibrary.add(book);
            }
        }
        return newLibrary;
    }

    public List<Book> getLibrary() {
        return library;
    }
}
