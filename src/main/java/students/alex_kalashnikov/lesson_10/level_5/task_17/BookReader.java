package students.alex_kalashnikov.lesson_10.level_5.task_17;

interface BookReader {

    boolean addBook(Book book);

    boolean checkContains(Book book);

    boolean checkParameters(Book book);

    boolean deleteBook(Book book);

    String[] findAllBooks();

    String[] findBooksByAuthor(String author);

}