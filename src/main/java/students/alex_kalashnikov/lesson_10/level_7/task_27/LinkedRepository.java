package students.alex_kalashnikov.lesson_10.level_7.task_27;

interface LinkedRepository {

    void add(Book book); // добавляет новую книгу в конец списка (нельзя добавить существующую книгу)

    void addAfter(Book newBook, Book after); // добавляет новую книгу в список после указанной книги ((нельзя добавить существующую книгу)

    void delete(Book book); // удаляет указанную книгу из списка

    Book find(Book book); // возвращает значение книги, если она есть в репозитории

//    Node findByAuthor(String author); // возвращает связанный список всех книг автора

}