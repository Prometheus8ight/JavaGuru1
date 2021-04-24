package students.julija_katukova.lesson_14.level_6;

import java.util.Comparator;

class StringComparatorABC implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return CharSequence.compare(o1, o2);
    }
}