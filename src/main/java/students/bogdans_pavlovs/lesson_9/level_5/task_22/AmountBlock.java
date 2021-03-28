package students.bogdans_pavlovs.lesson_9.level_5.task_22;

class AmountBlock {

    boolean isAmountBlock(Transaction t){

        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }

}
