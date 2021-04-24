package students.julija_katukova.lesson_14.level_5;

import java.util.Comparator;

class TransactionComparatorFromBigToSmall implements Comparator<Transaction> {

    @Override
    public int compare(Transaction t1, Transaction t2) {
        return Integer.compare(t2.getValue(), t1.getValue());
    }

}