package students.vitaly_porsev.lesson_11.level_7.task_39And40;

import java.util.Comparator;
import java.util.List;

class PageCriteria {

    private String page;
    private String lines;
    private String sortOrNot;


    public PageCriteria(String page, String lines, String sortOrNot) {
        this.page = page;
        this.lines = lines;
        this.sortOrNot = sortOrNot;
    }

    List<Book> outputByPageCriteria(List<Book> bookDatabase) {
        int userPage = Integer.parseInt(page);
        int userLines = Integer.parseInt(lines);

        if (page.isEmpty() || lines.isEmpty() && sortOrNot.isEmpty()) {
            return bookDatabase;
        } else if (page.isEmpty() || lines.isEmpty() && sortOrNot.toLowerCase().contains("yes")) {
            bookDatabase.sort(Comparator.comparing(Book::getAuthor));
            return bookDatabase;
        } else if (sortOrNot.toLowerCase().contains("yes")) {
            bookDatabase.sort(Comparator.comparing(Book::getAuthor));
            return bookDatabase.subList((userPage - 1) * userLines,
                    userLines + userLines * (userPage - 1));
        } else {
            return bookDatabase.subList((userPage - 1) * userLines,
                    userLines + userLines * (userPage - 1));
        }
    }
}
