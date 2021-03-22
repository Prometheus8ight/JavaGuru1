package students.alex_kalashnikov.lesson_9.level_4.task_19;

class FraudDetector {

    private String[] fraudList = {"Pokemon"};
    private String[] bannedLocations = {"Sydney"};
    private int maxTransactionAmount = 1000000;

    boolean isFraud(Transaction t) {
        for (String s : fraudList) {
            if (s.equals(t.getTrader().getFullName())) {
                return true;
            }
        }
        return false;
    }

    boolean isExcessAmount(Transaction t) {
        return t.getAmount() > maxTransactionAmount;
    }

    boolean isBannedLocation(Transaction t) {
        for (String s : bannedLocations) {
            if (s.equals(t.getTrader().getCity())) {
                return true;
            }
        }
        return false;
    }

}