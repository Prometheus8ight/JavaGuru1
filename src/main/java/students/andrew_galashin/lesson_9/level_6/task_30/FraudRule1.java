package students.andrew_galashin.lesson_9.level_6.task_30;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName() == "Pokemon";
    }
}

