package students.deniss_jankovskis.lesson_11.level_6;

import java.util.Scanner;

class DeleteBooksIUAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteBooksIUAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter e-book author: ");
        String bookAuthor = scanner.nextLine();
        System.out.println("Please enter e-book title: ");
        String bookTitle = scanner.nextLine();
        Book book = new Book(bookAuthor, bookTitle);
        bookDatabase.delete(book);
    }
}
