package students.alex_kalashnikov.lesson_10.level_5.task_18;

interface BookReader {

    boolean add(Book book);

    boolean delete(Book book);

    String[] findAll();

    String[] findByAuthor(String author);

    String[] findByAuthorLetters(String word);

}