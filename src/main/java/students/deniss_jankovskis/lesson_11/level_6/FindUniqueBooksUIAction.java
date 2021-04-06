package students.deniss_jankovskis.lesson_11.level_6;

import java.util.Set;

class FindUniqueBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<Book> bookDatabaseUniqueBooks = bookDatabase.findUniqueBooks();
        System.out.println(bookDatabaseUniqueBooks);
    }
}
