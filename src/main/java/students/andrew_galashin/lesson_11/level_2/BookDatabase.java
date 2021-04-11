package students.andrew_galashin.lesson_11.level_2;

import java.util.List;
import java.util.Optional;

interface BookDatabase {
    Long save(Book book);

    boolean deleteId(Long id);

    boolean deleteObject(Book book);

    Optional<Book> findId(Long id);

    List<Book> findAuthor(String author);

    List<Book> findTitle(String title);

    int countBooks();

    void deleteAuthor(String author);

    void deleteTitle(String title);

}
