package students.andrew_galashin.lesson_9.level_5.task_29;

class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity() == "Сидней";
    }
}
