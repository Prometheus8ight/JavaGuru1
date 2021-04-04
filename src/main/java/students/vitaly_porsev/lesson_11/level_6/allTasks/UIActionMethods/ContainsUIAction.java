package students.vitaly_porsev.lesson_11.level_6.allTasks.UIActionMethods;

import students.vitaly_porsev.lesson_11.level_6.allTasks.Book;
import students.vitaly_porsev.lesson_11.level_6.allTasks.BookDatabase;
import students.vitaly_porsev.lesson_11.level_6.allTasks.UIAction;

import java.util.Scanner;

public class ContainsUIAction implements UIAction {

    BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter book data, that you want to check: title, author and year of publishing.");
        System.out.println(bookDatabase.contains(new Book(scan.nextLine(), scan.nextLine(), scan.nextLine())));
    }
}
