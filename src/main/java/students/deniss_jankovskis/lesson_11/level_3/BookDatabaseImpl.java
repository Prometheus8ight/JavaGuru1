package students.deniss_jankovskis.lesson_11.level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    public List<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {
        long id = books.size();
        id++;
        book.setId(id);
        books.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book book1 : books) {
            if (book1.equals(book)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> out = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                out.add(book);
            }
        }
        return out;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> out = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                out.add(book);
            }
        }
        return out;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeIf(book -> book.getAuthor().equals(author));

    }

    @Override
    public void deleteByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> out = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                out.add(book);
            }
        }
        return out;
    }

    public List<Book> getBooks() {
        return books;
    }
}
