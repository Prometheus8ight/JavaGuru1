package students.vitaly_porsev.lesson_9.level_6.allTasks;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().contains("Sidney");
    }
}
