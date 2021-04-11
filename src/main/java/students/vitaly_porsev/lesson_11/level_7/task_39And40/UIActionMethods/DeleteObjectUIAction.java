package students.vitaly_porsev.lesson_11.level_7.task_39And40.UIActionMethods;

import students.vitaly_porsev.lesson_11.level_7.task_39And40.Book;
import students.vitaly_porsev.lesson_11.level_7.task_39And40.BookDatabase;

import java.util.Scanner;

class DeleteObjectUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteObjectUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter each data of the book from new line, to delete it: title, author and the year of year of publication");
        System.out.println(bookDatabase.deleteObject(new Book(scanner.nextLine(), scanner.nextLine(), scanner.nextLine())));
    }
}