package students.deniss_jankovskis.lesson_11.level_6;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter e-book author: ");
        String bookAuthor = scanner.nextLine();
        List<Book> bookList = bookDatabase.findByAuthor(bookAuthor);
        System.out.println(bookList);
    }
}
