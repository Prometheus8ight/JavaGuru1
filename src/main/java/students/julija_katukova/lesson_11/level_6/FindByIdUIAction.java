package students.julija_katukova.lesson_11.level_6;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book ID: ");
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println(bookOpt);
    }
}