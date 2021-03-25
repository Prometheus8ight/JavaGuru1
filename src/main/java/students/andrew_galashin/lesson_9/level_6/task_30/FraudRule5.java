package students.andrew_galashin.lesson_9.level_6.task_30;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry() == "Ямайка";
    }
}
