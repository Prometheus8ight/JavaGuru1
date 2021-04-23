package students.julija_katukova.lesson_14.level_3;

import java.util.Comparator;

class TransactionComparatorFromSmallToBig implements Comparator<Transaction> {

    @Override
    public int compare(Transaction t1, Transaction t2) {
        return Integer.compare(t1.getValue(), t2.getValue());
    }

}
