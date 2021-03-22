package students.alex_kalashnikov.lesson_9.level_6.task_31;

class FraudRule5 extends FraudRule {

    private String[] prohibitedCountries = {"Germany"};
    private int maxTransactionAmount;

    public FraudRule5(String ruleName, int maxTransactionAmount) {
        super(ruleName);
        this.maxTransactionAmount = maxTransactionAmount;
    }

    @Override
    public boolean isFraud(Transaction t) {
        for (String s : prohibitedCountries) {
            return s.equals(t.getTrader().getCountry()) && t.getAmount() > maxTransactionAmount;
        }
        return false;
    }
}