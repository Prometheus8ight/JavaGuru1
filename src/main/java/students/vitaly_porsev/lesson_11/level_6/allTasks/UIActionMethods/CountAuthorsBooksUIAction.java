package students.vitaly_porsev.lesson_11.level_6.allTasks.UIActionMethods;

import students.vitaly_porsev.lesson_11.level_6.allTasks.BookDatabase;
import students.vitaly_porsev.lesson_11.level_6.allTasks.UIAction;

public class CountAuthorsBooksUIAction  implements UIAction {

    BookDatabase bookDatabase;

    public CountAuthorsBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println(bookDatabase.getEachAuthorBookCount());
    }
}
