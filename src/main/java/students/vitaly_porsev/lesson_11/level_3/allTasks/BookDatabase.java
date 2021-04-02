package students.vitaly_porsev.lesson_11.level_3.allTasks;

import java.util.List;
import java.util.Optional;

interface BookDatabase {

    Long save(Book book);

    boolean deleteByID(Long bookId);

    boolean deleteObject(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);
}
