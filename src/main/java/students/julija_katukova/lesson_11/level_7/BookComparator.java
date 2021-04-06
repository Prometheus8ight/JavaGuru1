package students.julija_katukova.lesson_11.level_7;

import java.util.Comparator;

class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        if (CharSequence.compare(book1.getAuthor(), book2.getAuthor()) == 0) { //if authors are the same, compare titles
            return CharSequence.compare(book1.getTitle(), book2.getTitle());
        }
        return CharSequence.compare(book1.getAuthor(), book2.getAuthor());
    }
}