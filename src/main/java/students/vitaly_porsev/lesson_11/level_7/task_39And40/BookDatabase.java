package students.vitaly_porsev.lesson_11.level_7.task_39And40;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {

    Long save(Book book);

    boolean deleteByID(Long bookId);

    boolean deleteObject(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List findByCriteria(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    Set<String> findUniqueWords(String text);

    Map<String, List<Book>> getAuthorBooksToMap();

    Map<String, Integer> getEachAuthorBookCount();

    public List<Book> getLibrary();
}
