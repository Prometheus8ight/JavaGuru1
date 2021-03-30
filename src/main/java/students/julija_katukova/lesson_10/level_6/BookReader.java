package students.julija_katukova.lesson_10.level_6;

interface BookReader {

    boolean addNewBook(Book book);

    boolean deleteBook(Book book);

    String[] findAllBooks();

    Book[] findBooksByAuthor(String author);

    Book[] findBooksByTitle(String title);

    boolean wasRead(Book book);

    boolean wasUnread(Book book);

    String[] findAllReadBooks();

    String[] findAllUnreadBooks();
}