package students.vitaly_porsev.lesson_11.level_7.task_39And40.UIActionMethods;

import students.vitaly_porsev.lesson_11.level_7.task_39And40.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction  implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID of the book, that you want to delete: ");
        System.out.println(bookDatabase.deleteByID(scanner.nextLong()));
    }
}
