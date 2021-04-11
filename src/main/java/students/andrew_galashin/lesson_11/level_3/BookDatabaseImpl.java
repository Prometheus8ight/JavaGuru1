package students.andrew_galashin.lesson_11.level_3;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    List<Book> library = new ArrayList<>();
    long id = 0L;

    @Override
    public Long save(Book book) {
        id++;
        book.setId(id);
        library.add(book);
        return book.getId();
    }

    @Override
    public boolean deleteId(Long id) {
        return library.removeIf(book -> id.equals(book.getId()));
    }

    @Override
    public boolean deleteObject(Book book) {
        return library.removeIf(book1 -> book1.equals(book));
    }

    @Override
    public Optional<Book> findId(Long id) {
        for (Book book : library) {
            if (book.getId().equals(id)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findAuthor(String author) {
        List<Book> newLibrary = new ArrayList<>();
        for (Book book : library) {
            if (book.getAuthor().equals(author)) {
                newLibrary.add(book);
            }
        }
        return newLibrary;
    }

    @Override
    public List<Book> findTitle(String title) {
        List<Book> newLibrary = new ArrayList<>();
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                newLibrary.add(book);
            }
        }
        return newLibrary;
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

    @Override
    public int countBooks() {
        return library.size();
    }

    @Override
    public void deleteAuthor(String author) {
        library.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteTitle(String title) {
        library.removeIf(book -> book.getTitle().equals(title));
    }

    public List<Book> getLibrary() {
        return library;
    }

}
