package students.deniss_jankovskis.lesson_11.level_5;

import java.util.*;

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


    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> out = new HashSet<>();
        for (Book book : books) {
            out.add(book.getAuthor());
        }
        return out;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> out = new HashSet<>();
        for (Book book : books) {
            out.add(book.getTitle());
        }
        return out;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> hashMap = new HashMap<>();
        for (Book book : books) {
            hashMap.put(book.getAuthor(), find(new AuthorSearchCriteria(book.getAuthor())));
        }
        return hashMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> hashMap = new HashMap<>();
        for (Book book : books) {
            hashMap.put(book.getAuthor(), find(new AuthorSearchCriteria(book.getAuthor())).size());
        }
        return hashMap;
    }

    public List<Book> getBooks() {
        return books;
    }

}