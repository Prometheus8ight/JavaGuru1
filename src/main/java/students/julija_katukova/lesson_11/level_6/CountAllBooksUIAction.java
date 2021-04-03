package students.julija_katukova.lesson_11.level_6;

class CountAllBooksUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println(bookDatabase.countAllBooks());
    }
}