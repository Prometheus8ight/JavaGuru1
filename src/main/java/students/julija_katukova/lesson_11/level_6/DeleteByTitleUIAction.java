package students.julija_katukova.lesson_11.level_6;

import java.util.Scanner;

class DeleteByTitleUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book title: ");
        String title = scanner.nextLine();
        bookDatabase.deleteByTitle(title);
    }
}