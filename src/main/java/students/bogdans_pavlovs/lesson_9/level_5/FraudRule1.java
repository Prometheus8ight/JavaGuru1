package students.bogdans_pavlovs.lesson_9.level_5;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {

        return (t.getTrader().getFullName().equals("Pokemon"));

    }

}
