package students.bogdans_pavlovs.lesson_9.level_6;

class FraudDetector {

    FraudRule[] r;

    public FraudDetector(FraudRule[] r) {
        this.r = r;
    }

    FraudDetectionResult isFraud(Transaction t) {

        for (FraudRule r : r) {

            if (r.isFraud(t)) {
                System.out.println(t.toString());
                return new FraudDetectionResult(r.isFraud(t), r.getRuleName());
            }
        }

        return null;
    }
}
