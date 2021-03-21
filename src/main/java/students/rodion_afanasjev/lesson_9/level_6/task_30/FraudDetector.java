package students.rodion_afanasjev.lesson_9.level_6.task_30;

class FraudDetector {

    private FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                System.out.println(t.toString());
                return new FraudDetectionResult(fraudRule.isFraud(t), fraudRule.getRuleName());
            }
        }
        return null;
    }

}
