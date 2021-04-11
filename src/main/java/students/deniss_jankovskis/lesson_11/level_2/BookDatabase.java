package students.deniss_jankovskis.lesson_11.level_2;

import java.util.List;
import java.util.Optional;

interface BookDatabase {

    int save(Book book);

    boolean delete(int bookId);

    boolean delete(Book book);

    Optional<Book> findById(int bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

}
