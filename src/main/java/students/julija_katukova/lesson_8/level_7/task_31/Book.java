package students.julija_katukova.lesson_8.level_7.task_31;

import java.util.Date;
import java.util.Objects;

class Book {

    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;
    private boolean isReserved;
    private User userId;
    private Date dueToDate;

    Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    Book(String id, String title, String author, boolean isBorrowed, boolean isReserved, User userId, Date dueToDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
        this.isReserved = isReserved;
        this.userId = userId;
        this.dueToDate = dueToDate;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public void setDueToDate(Date dueToDate) {
        this.dueToDate = dueToDate;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isBorrowed=" + isBorrowed +
                ", isReserved=" + isReserved +
                ", userId=" + userId +
                ", dueToDate=" + dueToDate +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }
}



