package students.vitaly_porsev.lesson_9.level_4.tasks;

class FraudDetector {

    boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().contains("Pokemon")) {
            return true;
        } else if (t.getAmount() > 1000000) {
            return true;
        } else if (t.getTrader().getCity().contains("Sidney")) {
            return true;
        } else if (t.getTrader().getCountry().contains("Jamaica")) {
            return true;
        } else return t.getTrader().getCountry().contains("Germany") && t.getAmount() > 1000;
    }
}
