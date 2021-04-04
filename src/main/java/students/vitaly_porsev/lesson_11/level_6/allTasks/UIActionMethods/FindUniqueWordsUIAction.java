package students.vitaly_porsev.lesson_11.level_6.allTasks.UIActionMethods;

import students.vitaly_porsev.lesson_11.level_6.allTasks.BookDatabase;
import students.vitaly_porsev.lesson_11.level_6.allTasks.UIAction;

import java.util.Scanner;

public class FindUniqueWordsUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindUniqueWordsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text, that you want to check: ");
        System.out.println(bookDatabase.findUniqueWords(scanner.nextLine()));
    }
}
