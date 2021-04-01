package students.deniss_jankovskis.lesson_10.level_6;

interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    String[] findAllBooks();

    Book[] findBookByAuthor(String author);

    Book[] findBooksByTitle(String title);

    boolean readBook(Book book);

    boolean unreadBook(Book book);

    String[] findAllReadBooks();

    String[] findAllUnreadBooks();
}
