package students.vitaly_porsev.lesson_10.level_6.allTasks;

class Book {

    private String title;
    private String author;
    private boolean readBook;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isReadBook() {
        return readBook;
    }

    public void setReadBook(boolean readBook) {
        this.readBook = readBook;
    }

    @Override
    public String toString() {
        return title + " [" + author + "]";
    }
}
