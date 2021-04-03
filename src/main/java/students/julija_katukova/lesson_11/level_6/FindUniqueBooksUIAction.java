package students.julija_katukova.lesson_11.level_6;

import java.util.Set;

class FindUniqueBooksUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<Book> books = bookDatabase.findUniqueBooks();
        System.out.println(books);
    }
}