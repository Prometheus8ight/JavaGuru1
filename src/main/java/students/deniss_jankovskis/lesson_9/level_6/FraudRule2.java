package students.deniss_jankovskis.lesson_9.level_6;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getAmount() > 100000;

    }

}
