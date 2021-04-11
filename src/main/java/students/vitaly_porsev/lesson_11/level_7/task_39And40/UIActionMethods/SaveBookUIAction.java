package students.vitaly_porsev.lesson_11.level_7.task_39And40.UIActionMethods;

import students.vitaly_porsev.lesson_11.level_7.task_39And40.Book;
import students.vitaly_porsev.lesson_11.level_7.task_39And40.BookDatabase;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To save a book, enter each from new line: title, author and year of publication: ");
        bookDatabase.save(new Book(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        System.out.println("It`s done!");
    }
}
