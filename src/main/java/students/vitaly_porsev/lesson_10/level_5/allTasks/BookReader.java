package students.vitaly_porsev.lesson_10.level_5.allTasks;

interface BookReader {

    boolean addBookToTheLibrary(String title, String author);

    boolean deleteBookByTitle(String title);

    String[] findBooksByAuthor(String author);

    String[] findAllBooks();

    String[] findBooksByWord(String word);
}
