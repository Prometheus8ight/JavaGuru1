package students.alex_kalashnikov.lesson_8.level_7.task_31;

import java.time.LocalDate;

class LibraryBooks {

    private int bookId;
    private String bookName;
    private String authorName;
    private boolean notAvailable;
    private String isReservedForUser;
    private LocalDate dateOfHanding;
    private static int count = 1;
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int idNumber) {
        this.bookId = idNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isNotAvailable() {
        return notAvailable;
    }

    public void setNotAvailable(boolean notAvailable) {
        this.notAvailable = notAvailable;
    }

    public String isReservedForUser() {
        return isReservedForUser;
    }

    public void setIsReservedForUser(String userId) {
        isReservedForUser = userId;
    }

    public LocalDate getDateOfHanding() {
        return dateOfHanding;
    }

    public void setDateOfHanding(LocalDate dateOfHanding) {
        this.dateOfHanding = dateOfHanding;
    }

    public LibraryBooks(String bookName, String authorName) {
        this.bookId = count;
        this.bookName = bookName;
        this.authorName = authorName;
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
                ", Name='" + bookName + '\'' +
                ", Author='" + authorName + '\'' +
                ", Not Available='" + notAvailable + '\'' +
                ", Is Reserved for User='" + isReservedForUser + '\'' +
                ", Date Of Handing='" + dateOfHanding + '\'' +
                ", UserID='" + userId + '\'' +
                '}' + "\n";
    }
}