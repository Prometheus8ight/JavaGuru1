package students.julija_katukova.lesson_11.level_6;

import java.util.Scanner;

class DeleteByAuthorUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book author: ");
        String author = scanner.nextLine();
        bookDatabase.deleteByAuthor(author);
    }
}