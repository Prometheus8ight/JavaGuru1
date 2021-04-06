package students.deniss_jankovskis.lesson_11.level_6;

import java.util.Scanner;

class DeleteBookByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteBookByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter e-book author: ");
        String bookAuthor = scanner.nextLine();
        bookDatabase.deleteByAuthor(bookAuthor);
    }
}
