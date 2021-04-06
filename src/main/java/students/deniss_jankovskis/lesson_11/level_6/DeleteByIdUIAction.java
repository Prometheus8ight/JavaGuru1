package students.deniss_jankovskis.lesson_11.level_6;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter e-book ID: ");
        int id = scanner.nextInt();
        bookDatabase.delete(id);
    }
}

