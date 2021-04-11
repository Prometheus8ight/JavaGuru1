package students.deniss_jankovskis.lesson_11.level_6;

import java.util.Set;

class FindUniqueAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> bookDatabaseUniqueAuthors = bookDatabase.findUniqueAuthors();
        System.out.println(bookDatabaseUniqueAuthors);
    }
}
