package students.alex_kalashnikov.lesson_10.level_5.task_16;

import java.util.Objects;

class Book {

    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name)
                && Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}