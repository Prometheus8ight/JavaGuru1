package students.julija_katukova.lesson_11.level_6;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book ID: ");
        Long id = scanner.nextLong();
        bookDatabase.delete(id);
    }
}