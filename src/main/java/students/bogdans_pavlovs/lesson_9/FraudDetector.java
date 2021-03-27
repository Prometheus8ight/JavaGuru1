package students.bogdans_pavlovs.lesson_9;

class FraudDetector {

    public FraudDetector(Transaction t) {
    }

    boolean isFraud(Transaction t) {

        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;

        } else if (t.getAmount() > 1000000) {
            return true;

        } else if (t.getTrader().getCity().equals("Sydney")) {
            return true;

        } else if (t.getTrader().getCountry().equals("Jamaica")) {
            return true;

        } else if (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000) {
            return true;

        }

        return false;
    }
}