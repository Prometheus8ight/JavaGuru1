package students.alex_kalashnikov.lesson_9.level_4.task_21;

class FraudDetector {

    private String[] fraudList = {"Pokemon"};
    private String[] bannedCities = {"Sydney"};
    private String[] bannedCountries = {"Jamaica", "Germany"};

    boolean isFraud(Transaction t) {
        for (String s : fraudList) {
            if (s.equals(t.getTrader().getFullName())) {
                return true;
            }
        }
        return false;
    }

    boolean isExcessAmount(Transaction t, int maxTransactionAmount) {
        return t.getAmount() > maxTransactionAmount;
    }

    boolean isBannedLocation(Transaction t) {
        for (String s : bannedCities) {
            if (s.equals(t.getTrader().getCity())) {
                return true;
            }
        }
        return false;
    }

    boolean isBannedCountry(Transaction t) {
        for (String s : bannedCountries) {
            if (s.equals(t.getTrader().getCountry())) {
                return true;
            }
        }
        return false;
    }

}