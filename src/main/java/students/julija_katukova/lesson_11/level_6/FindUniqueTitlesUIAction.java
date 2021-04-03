package students.julija_katukova.lesson_11.level_6;

import java.util.Set;

class FindUniqueTitlesUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> books = bookDatabase.findUniqueTitles();
        System.out.println(books);
    }
}