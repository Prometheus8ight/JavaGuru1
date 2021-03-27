package students.bogdans_pavlovs.lesson_9.level_5;

class FraudDetector {

    FraudRule[] r;

    public FraudDetector(FraudRule[] r) {
        this.r = r;
    }

    boolean isFraud(Transaction t) {

        for (FraudRule r : r) {

            if (r.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}
