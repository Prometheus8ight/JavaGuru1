package students.vitaly_porsev.lesson_11.level_7.task_39And40.UIActionMethods;


import students.vitaly_porsev.lesson_11.level_7.task_39And40.Book;
import students.vitaly_porsev.lesson_11.level_7.task_39And40.BookDatabase;

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