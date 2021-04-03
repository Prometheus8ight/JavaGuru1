package students.alex_kalashnikov.lesson_10.level_6.task_20;

interface BookReader {

    boolean addBook(Book book);

    boolean checkContains(Book book);

    boolean checkParameters(Book book);

    boolean deleteBook(Book book);

    String[] findAllBooks();

    String[] findBooksByAuthor(String author);

    String[] findBooksByLetters(String word);


    String[] findBooksByName(String name);

    String[] findBooksByNameLetters(String word);

}