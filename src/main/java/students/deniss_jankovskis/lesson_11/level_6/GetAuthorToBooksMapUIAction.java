package students.deniss_jankovskis.lesson_11.level_6;

import java.util.List;
import java.util.Map;

class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Map<String, List<Book>> booksMap = bookDatabase.getAuthorToBooksMap();
        System.out.println(booksMap);
    }
}
