package students.julija_katukova.lesson_11.level_6;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book title: ");
        String title = scanner.nextLine();
        List<Book> books = bookDatabase.findByTitle(title);
        System.out.println(books);
    }
}