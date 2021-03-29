package students.vitaly_porsev.lesson_10.level_6.allTasks;

interface BookReader {

    boolean addBookToTheLibrary(String title, String author);

    boolean deleteBookByTitle(String title);

    String[] findBooksWithEqualAuthor(String author);

    String[] findAllBooks();

    String[] findBooksWithEqualAuthorsNameOrSurname(String word);

    String[] findBooksByEqualTitle(String author);

    String[] findBooksWithEqualWordsInTitle(String title);

    boolean readBook(String title);

    boolean unreadBook(String title);

    String[] findReadBooks();

    String[] findUnreadBooks();
}
