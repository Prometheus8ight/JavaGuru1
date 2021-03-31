package students.deniss_jankovskis.lesson_10.level_5;

interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    String[] findAllBooks();

    Book[] findBookByAuthor(String author);

}
