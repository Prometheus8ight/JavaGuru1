package students.andrew_galashin.lesson_9.level_6.task_31;

class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity() == "Сидней";
    }
}
