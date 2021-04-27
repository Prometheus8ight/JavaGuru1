package students.deniss_jankovskis.lesson_14.level_6;

import java.util.Comparator;

class ComparatorFromMaxToMin implements Comparator<Transaction> {

    @Override
    public int compare(Transaction o1, Transaction o2) {
        return Integer.compare(o2.getValue(), o1.getValue());
    }
}
