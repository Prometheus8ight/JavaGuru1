package students.julija_katukova.lesson_9.level_6;

class FraudDetector {

    FraudRule[] fraudRule;

    public FraudDetector(FraudRule[] fraudRule) {
        this.fraudRule = fraudRule;
    }

    public FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRule) {
            if (fraudRule.isFraud(t)) {
                System.out.println(t.toString());
                return new FraudDetectionResult(fraudRule.isFraud(t), fraudRule.getRuleName());
            }
        }
        return null;
    }
}