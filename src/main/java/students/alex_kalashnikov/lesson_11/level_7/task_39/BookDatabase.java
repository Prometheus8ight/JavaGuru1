package students.alex_kalashnikov.lesson_11.level_7.task_39;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

interface BookDatabase {

    void setBooksPerPage(int booksPerPage);

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByAuthor(String author, int pageCriteria);

    List<Book> findByTitle(String title);

    List<Book> findByTitle(String title, int pageCriteria);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueAuthors(int pageCriteria);

    Set<String> findUniqueTitles();

    Set<String> findUniqueTitles(int pageCriteria);

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();

}