package students.bogdans_pavlovs.lesson_9.level_5.task_22;

class TraderBlock {

    boolean isTraderBlock(Transaction t){

        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }

}
