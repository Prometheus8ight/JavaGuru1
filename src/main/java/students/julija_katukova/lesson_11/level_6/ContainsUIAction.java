package students.julija_katukova.lesson_11.level_6;

import java.util.Scanner;

class ContainsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book author: ");
        String author = scanner.nextLine();
        System.out.println("Please enter book title: ");
        String title = scanner.nextLine();
        Book book = new Book(author, title);
        System.out.println(bookDatabase.contains(book));
    }
}