package students.deniss_jankovskis.lesson_9.level_5;

class FraudDetector {

    FraudRule[] fraudRules;

    public void FraudRule(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                return true;
            }

        }
        return false;

    }


}
