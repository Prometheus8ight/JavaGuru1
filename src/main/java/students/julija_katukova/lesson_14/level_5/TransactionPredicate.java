package students.julija_katukova.lesson_14.level_5;

@FunctionalInterface
interface TransactionPredicate {

    boolean test(Transaction transaction);
}