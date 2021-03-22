package students.vitaly_porsev.lesson_9.level_5.tasks;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().contains("Pokemon");
    }
}