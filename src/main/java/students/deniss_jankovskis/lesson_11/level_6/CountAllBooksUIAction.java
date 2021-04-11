package students.deniss_jankovskis.lesson_11.level_6;

import java.util.Scanner;

class CountAllBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println(bookDatabase.countAllBooks());
    }
}
