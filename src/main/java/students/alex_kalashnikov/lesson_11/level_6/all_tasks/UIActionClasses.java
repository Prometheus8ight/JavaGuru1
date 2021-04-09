package students.alex_kalashnikov.lesson_11.level_6.all_tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter author: ");
        String author = scanner.next();
        System.out.print("Enter title: ");
        String title = scanner.next();

        Book book = new Book(author, title);
        bookDatabase.save(book);
    }

}

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter id: ");
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println(bookOpt);
    }

}

class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter author: ");
        String author = scanner.next();
        List<Book> arr = bookDatabase.findByAuthor(author);
        System.out.println(Arrays.toString(arr.toArray()));
    }

}

class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter title: ");
        String title = scanner.next();
        List<Book> arr = bookDatabase.findByTitle(title);
        System.out.println(Arrays.toString(arr.toArray()));

    }

}

class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter id: ");
        Long id = scanner.nextLong();
        bookDatabase.delete(id);
    }

}

class DeleteByBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter author: ");
        String author = scanner.next();
        System.out.print("Enter title: ");
        String title = scanner.next();

        Book book = new Book(author, title);
        bookDatabase.delete(book);
    }

}

class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter author: ");
        String author = scanner.next();
        bookDatabase.deleteByAuthor(author);
    }

}

class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter title: ");
        String title = scanner.next();
        bookDatabase.deleteByTitle(title);
    }

}

class CountAllBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(bookDatabase.countAllBooks());
    }

}

class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(Arrays.toString(bookDatabase.findUniqueAuthors().toArray()));
    }

}

class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(Arrays.toString(bookDatabase.findUniqueTitles().toArray()));

    }

}

class FindUniqueBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(Arrays.toString(bookDatabase.findUniqueBooks().toArray()));
    }

}

class ContainsIUAction implements UIAction {

    private BookDatabase bookDatabase;

    public ContainsIUAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter author: ");
        String author = scanner.next();
        System.out.print("Enter title: ");
        String title = scanner.next();
        Book book = new Book(author, title);
        System.out.println(bookDatabase.contains(book));
    }

}

class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(Arrays.toString(bookDatabase.getAuthorToBooksMap().values().toArray()));
    }

}

class GetEachAuthorBookCountUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(Arrays.toString(bookDatabase.getEachAuthorBookCount().entrySet().toArray()));
    }

}