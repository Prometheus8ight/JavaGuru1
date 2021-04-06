package students.vitaly_porsev.lesson_11.level_7.task_39And40.UIActionMethods;

import students.vitaly_porsev.lesson_11.level_7.task_39And40.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {

    BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book`s title to delete it");
        bookDatabase.deleteByTitle(scanner.next());
    }
}