package students.bogdans_pavlovs.lesson_11.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    ArrayList<Book> books = new ArrayList<>();

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
        if(books.contains(book)){
            books.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {

        for (Book book : books) {

            if (book.getId().equals(bookId)){
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {

        List<Book> contains = new ArrayList<>();

        for (Book book : books) {

            if(book.getAuthor().equals(author)){
                contains.add(book);
            }

        }
        return contains;
    }

    @Override
    public List<Book> findByTitle(String title) {

        List<Book> contains = new ArrayList<>();

        for (Book book : books) {

            if(book.getTitle().equals(title)){
                contains.add(book);
            }

        }
        return contains;
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
}

/*
Данный метод предназначен для удаления всех книг c указанным названием из библиотеки.
Реализуйте данный метод и протестируйте его.
 */