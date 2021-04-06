package students.deniss_jankovskis.lesson_11.level_6;

import java.util.Set;

class FindUniqueTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> bookDatabaseUniqueTitles = bookDatabase.findUniqueTitles();
        System.out.println(bookDatabaseUniqueTitles);
    }
}
