package students.julija_katukova.lesson_10.level_7.task_27;

import java.util.Comparator;

class ObjectComparator implements Comparator<Object> {

    @Override
    public int compare(Object object1, Object object2) {
        return CharSequence.compare(object1.getTitle(), object2.getTitle());
    }
}