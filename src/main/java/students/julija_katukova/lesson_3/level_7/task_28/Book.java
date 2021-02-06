package students.julija_katukova.lesson_3.level_7.task_28;

public class Book {
    String title;
    String author;
    int year;
    String publisher;
    int pages;

    Book(String bookTitle, String bookAuthor, int bookYear, String bookPublisher, int bookPages){
        this.title = bookTitle;
        this.author = bookAuthor;
        this.year = bookYear;
        this.publisher = bookPublisher;
        this.pages = bookPages;
    }

    public void giveInfo () {
        System.out.println("Предаставляю информацию по запрошенной книге");
        System.out.println("Название: " + this.title);
        System.out.println("Автор: " + this.author);
        System.out.println("Год написания: " + this.year);
        System.out.println("Издательство: " + this.publisher);
        System.out.println("Колиство страниц: " + this.pages);
    }


}
