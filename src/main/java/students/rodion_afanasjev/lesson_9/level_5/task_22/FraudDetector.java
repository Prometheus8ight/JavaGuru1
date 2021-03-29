package students.rodion_afanasjev.lesson_9.level_5.task_22;

class FraudDetector {

    FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(FraudRule[] fraudRules, Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }

}
