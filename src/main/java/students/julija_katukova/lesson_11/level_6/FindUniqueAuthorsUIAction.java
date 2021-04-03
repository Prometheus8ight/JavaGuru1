package students.julija_katukova.lesson_11.level_6;

import java.util.Set;

class FindUniqueAuthorsUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> books = bookDatabase.findUniqueAuthors();
        System.out.println(books);
    }
}