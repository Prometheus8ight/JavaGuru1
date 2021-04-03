package students.julija_katukova.lesson_11.level_6;

import java.util.Map;

class GetEachAuthorBookCountUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Map<String, Integer> books = bookDatabase.getEachAuthorBookCount();
        System.out.println(books);
    }
}