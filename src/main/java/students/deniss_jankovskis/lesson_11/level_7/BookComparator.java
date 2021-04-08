package students.deniss_jankovskis.lesson_11.level_7;

import java.util.Comparator;

class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    }

