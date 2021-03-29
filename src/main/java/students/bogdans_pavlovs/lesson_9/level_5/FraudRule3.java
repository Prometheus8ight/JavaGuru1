package students.bogdans_pavlovs.lesson_9.level_5;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCity().equals("Sydney"));
    }
}