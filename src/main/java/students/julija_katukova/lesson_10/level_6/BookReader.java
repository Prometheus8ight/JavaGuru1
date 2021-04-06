package students.julija_katukova.lesson_10.level_6;

interface BookReader {

    boolean add(Book book);

    boolean delete(Book book);

    Book[] findAll();

    Book[] findBooksByAuthor(String author);

    Book[] findBooksByTitle(String title);

    boolean wasRead(Book book);

    boolean wasUnread(Book book);

    Book[] findAllReadBooks();

    Book[] findAllUnreadBooks();
}