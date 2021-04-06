package students.alex_kalashnikov.lesson_10.level_6.task_19;

interface BookReader {

    boolean add(Book book);

    boolean delete(Book book);

    String[] findAll();

    String[] findByAuthor(String author);

    String[] findByAuthorLetters(String word);

    String[] findByName(String name);

}