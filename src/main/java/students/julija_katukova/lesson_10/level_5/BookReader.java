package students.julija_katukova.lesson_10.level_5;

interface BookReader {

    boolean addNewBook(Book book);

    boolean deleteBook(Book book);

    String[] findAllBooks();

    Book[] findBooksByAuthor(String author);

}
