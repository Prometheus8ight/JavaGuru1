package students.vitaly_porsev.lesson_11.level_6.allTasks.UIActionMethods;

import students.vitaly_porsev.lesson_11.level_6.allTasks.BookDatabase;
import students.vitaly_porsev.lesson_11.level_6.allTasks.UIAction;

import java.util.Scanner;

class FindByTitleUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title of the book: ");
        System.out.println(bookDatabase.findByTitle(scanner.next()));
    }
}
