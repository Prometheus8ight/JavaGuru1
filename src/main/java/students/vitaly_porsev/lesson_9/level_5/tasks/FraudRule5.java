package students.vitaly_porsev.lesson_9.level_5.tasks;

public class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().contains("Germany") && t.getAmount() > 1000;
    }
}
