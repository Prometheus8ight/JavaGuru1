package students.julija_katukova.lesson_3.level_7.task_28;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой Л. Н.", 1867, "Эксмо", 1225);
        Book book2 = new Book ("Анна Каренина", "Толстой Л. Н.", 1877, "АСТ", 864);

        book1.giveInfo();
        book2.giveInfo();
    }


}
