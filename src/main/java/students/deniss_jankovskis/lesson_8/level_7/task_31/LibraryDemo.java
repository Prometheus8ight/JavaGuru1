package students.deniss_jankovskis.lesson_8.level_7.task_31;

class LibraryDemo {

    public static void main(String[] args) {

        Library library = new Library();
        library.addBookInTheLibrary("Head First Java");
        library.addBookInTheLibrary("Head First Design Patterns");
        library.addBookInTheLibrary("Grokking Algorithms");
        library.addBookInTheLibrary("Clean Code");
        library.addBookInTheLibrary("Java 8 in Action");
        library.takeBookFromLibrary("Head First Java", "5/04/2021 15:00");
        library.takeBookFromLibrary("Head First Design Patterns", "20/04/2021 13:00");
        library.takeBookFromLibrary("Clean Code", "15/04/2021 12:00");

        System.out.println(library.returnBookToLibrary("Head First Java"));
        System.out.println(library.payForThePenalty("Head First Java", 5));
        System.out.println(library.payForThePenalty("Head First Java", 5));
        System.out.println(library.bookReservation("Clean Code"));
        System.out.println(library.takeBookFromLibrary("Clean Code", "30/04/2021 18:00"));
        System.out.println(library.checkBook("Java 8 in Action"));
    }
}
