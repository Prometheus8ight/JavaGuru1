package students.bogdans_pavlovs.lesson_9.level_5.task_22;

class CountryBlock {

    boolean isCountryBlock(Transaction t){

        if (t.getTrader().getCity().equals("Sydney") || t.getTrader().getCity().equals("Jamaica")) {
            return true;

        } else if (t.getTrader().getCity().equals("Germany") && t.getAmount() > 1000) {
            return true;

        }
        return false;
    }
}
