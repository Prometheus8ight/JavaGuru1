package students.julija_katukova.lesson_11.level_6;

import java.util.List;
import java.util.Map;

class GetAuthorsToBookMapUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public GetAuthorsToBookMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Map<String, List<Book>> books = bookDatabase.getAuthorToBooksMap();
        System.out.println(books);
    }
}