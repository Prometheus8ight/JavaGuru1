package students.deniss_jankovskis.lesson_10.level_6;

import java.util.Objects;

class Book {

    private final String title;
    private final String author;
    private boolean markReadBook;
    private boolean markUnreadBook;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean markReadBook() {
        return markReadBook;
    }

    public void setMarkReadBook(boolean markReadBook) {
        this.markReadBook = markReadBook;
    }

    public boolean markUnreadBook() {
        return markUnreadBook;
    }

    public void setMarkUnreadBook(boolean markUnreadBook) {
        this.markUnreadBook = markUnreadBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title +
                ", author='" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
