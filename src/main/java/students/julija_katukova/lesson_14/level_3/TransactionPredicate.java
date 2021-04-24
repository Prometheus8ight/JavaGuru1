package students.julija_katukova.lesson_14.level_3;

@FunctionalInterface
interface TransactionPredicate {

    boolean test(Transaction transaction);
}
