package students.deniss_jankovskis.lesson_11.level_6;

import java.util.Map;

class GetEachAuthorBookCountUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Map<String, Integer> bookCount = bookDatabase.getEachAuthorBookCount();
        System.out.println(bookCount);
    }
}
