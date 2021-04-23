package students.julija_katukova.lesson_14.level_4;

@FunctionalInterface
interface TransactionPredicate {

    boolean test(Transaction transaction);
}