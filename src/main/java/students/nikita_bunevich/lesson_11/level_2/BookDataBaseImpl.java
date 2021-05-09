package students.nikita_bunevich.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Objects;

class BookDataBaseImpl implements BookDataBase {

    public List<Book> books = new ArrayList<>();

    @Override
    public int save(Book book) {
        int id = books.size();
        id++;
        book.setId(id);
        books.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(int bookId) {
        for (Book book : books) {
            if (Objects.equals(book.getId(), bookId)) {
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
    public Optional<Book> findById(int bookId) {
        for (Book book : books) {
            if (Objects.equals(book.getId(), bookId)) {
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

    public List<Book> getBooks() {
        return books;
    }
}

