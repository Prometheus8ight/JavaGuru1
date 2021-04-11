package students.julija_katukova.lesson_10.level_5;

interface BookReader {

    boolean add(Book book);

    boolean delete(Book book);

    Book[] findAll();

    Book[] findBooksByAuthor(String author);

}
