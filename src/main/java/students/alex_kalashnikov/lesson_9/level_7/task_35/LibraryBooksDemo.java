package students.alex_kalashnikov.lesson_9.level_7.task_35;

class LibraryBooksDemo {

    public static void main(String[] args) {

        LibraryBooks book1 = new LibraryBooks.LibraryBooksBuilder("Clean Code", "Robert Martin")
                .getBookId()
                .isNotAvailable()
                .isReservedForUser()
                .getDateOfHanding()
                .getUserId()
                .build();

        LibraryBooks book2 = new LibraryBooks.LibraryBooksBuilder("Head First Java", "Kathy Sierra")
                .getBookId()
                .isNotAvailable()
                .isReservedForUser()
                .getDateOfHanding()
                .getUserId()
                .build();

        LibraryBooks book3 = new LibraryBooks.LibraryBooksBuilder("Head First Design Patterns", "Eric Freeman")
                .getBookId()
                .isNotAvailable()
                .isReservedForUser()
                .getDateOfHanding()
                .getUserId()
                .build();

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }

}