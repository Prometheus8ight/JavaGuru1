package students.julija_katukova.lesson_11.level_6;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book author: ");
        String author = scanner.nextLine();
        List<Book> books = bookDatabase.findByAuthor(author);
        System.out.println(books);
    }
}