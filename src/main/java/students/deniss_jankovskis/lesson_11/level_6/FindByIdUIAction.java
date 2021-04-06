package students.deniss_jankovskis.lesson_11.level_6;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter e-book ID number: ");
        int id = scanner.hashCode();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println(bookOpt);
    }
}
