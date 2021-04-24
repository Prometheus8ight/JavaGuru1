package students.julija_katukova.lesson_14.level_6;

class Transaction2011YearPredicate implements TransactionPredicate {

    @Override
    public boolean test(Transaction transaction) {
        return transaction.getYear() == 2011;
    }
}