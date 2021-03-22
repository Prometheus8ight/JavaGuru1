package students.julija_katukova.lesson_9.level_6;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    public String getRuleName() {
        return ruleName;
    }

    @Override
    public String toString() {
        return "FraudRule{" +
                "ruleName='" + ruleName + '\'' +
                '}';
    }
}