package students.deniss_jankovskis.lesson_10.task_26;

import java.util.Comparator;

class ObjectComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        return CharSequence.compare(o1.getTitle(), o2.getTitle());
    }
}
