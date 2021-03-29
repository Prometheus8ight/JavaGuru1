package students.bogdans_pavlovs.lesson_9.level_6;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    String getRuleName(){
        return ruleName;
    }

}
