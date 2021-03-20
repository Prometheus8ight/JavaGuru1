package students.vitaly_porsev.lesson_9.level_6.allTasks;

class FraudDetector {

    FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                return new FraudDetectionResult(fraudRule.isFraud(t), fraudRule.getRuleName(), t);
            }
        }
        return null;
    }
}
