package students.julija_katukova.lesson_8.level_7.task_31;

abstract class Library {

    abstract void takeBook(Book book, User userId);

    abstract void returnBook(Book book);

    public abstract Book findBookById(String id);

    abstract void reserveBook(Book book, User userId);

    abstract void sendNotifications(Book book, User user);

    abstract void issuePenalty(Book book, User user);

    abstract void addNewBook(Book book);

}
