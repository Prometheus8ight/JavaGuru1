package students.vitaly_porsev.lesson_9.level_5.tasks;

public class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().contains("Jamaica");
    }
}
