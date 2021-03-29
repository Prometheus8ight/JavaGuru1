package students.deniss_jankovskis.lesson_9.level_6;

class FraudDetector {

    FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    public FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                System.out.println(t.toString());
                return new FraudDetectionResult(fraudRule.isFraud(t), fraudRule.getRuleName());
            }
        }
        return null;
    }

}




