package students.alex_kalashnikov.lesson_9.level_7.task_35;

import java.time.LocalDate;
import java.util.Objects;

class LibraryBooks {

    private int bookId;
    private String bookName;
    private String authorName;
    private boolean notAvailable;
    private String isReservedForUser;
    private LocalDate dateOfHanding;
    private String userId;
    private static int count = 1;

    // конструктор для теста
    public LibraryBooks(String bookName, String authorName) {
        this.bookId = count;
        this.bookName = bookName;
        this.authorName = authorName;
        this.notAvailable = false;
        this.isReservedForUser = "";
        this.dateOfHanding = null;
        this.userId = "";
        count++;
    }

    // сеттер для теста
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    private LibraryBooks(LibraryBooksBuilder book) {
        this.bookId = count;
        this.bookName = book.bookName;
        this.authorName = book.authorName;
        this.notAvailable = false;
        this.isReservedForUser = ""; // если "", то книга не зарезервирована
        this.dateOfHanding = null;
        this.userId = "";
        count++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID='" + bookId + '\'' +
                "|| Name='" + bookName + '\'' +
                "|| Author='" + authorName + '\'' +
                "|| Not Available='" + notAvailable + '\'' +
                "|| Is Reserved for User='" + isReservedForUser + '\'' +
                "|| Date Of Handing='" + dateOfHanding + '\'' +
                "|| UserID='" + userId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryBooks book = (LibraryBooks) o;
        return Objects.equals(bookId, book.bookId)
                && Objects.equals(bookName, book.bookName)
                && Objects.equals(authorName, book.authorName)
                && Objects.equals(notAvailable, book.notAvailable)
                && Objects.equals(isReservedForUser, book.isReservedForUser)
                && Objects.equals(dateOfHanding, book.dateOfHanding)
                && Objects.equals(userId, book.userId);
    }

    static class LibraryBooksBuilder {

        private int bookId;
        private String bookName;
        private String authorName;
        private boolean notAvailable;
        private String isReservedForUser;
        private LocalDate dateOfHanding;
        private String userId;
        private static int count = 1;

        public LibraryBooksBuilder(String bookName, String authorName) {
            this.bookName = bookName;
            this.authorName = authorName;
        }

        public LibraryBooksBuilder getBookId() {
            this.bookId = count;
            return this;
        }

        public LibraryBooksBuilder isNotAvailable() {
            this.notAvailable = false;
            return this;
        }

        public LibraryBooksBuilder isReservedForUser() {
            this.isReservedForUser = "";
            return this;
        }

        public LibraryBooksBuilder getDateOfHanding() {
            this.dateOfHanding = null;
            return this;
        }

        public LibraryBooksBuilder getUserId() {
            this.userId = null;
            return this;
        }

        public LibraryBooks build() {
            LibraryBooks newBook = new LibraryBooks(this);
            newBook.bookId = count;
            newBook.bookName = this.bookName;
            newBook.authorName = this.authorName;
            newBook.notAvailable = false;
            newBook.isReservedForUser = ""; // если "", то книга не зарезервирована
            newBook.dateOfHanding = null;
            newBook.userId = "";
            count++;
            return newBook;
        }
    }

}