package main.java.students.julija_katukova.lesson_9.level_5;

class FraudDetector {

    FraudRule[] fraudRule;

    public FraudDetector(FraudRule[] fraudRule) {
        this.fraudRule = fraudRule;
    }

    public boolean isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRule) {
            if (fraudRule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}
