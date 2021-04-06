package students.alex_kalashnikov.lesson_10.level_7.task_25;

class FraudRule5 implements FraudRule {

    private String[] prohibitedCountries = {"Germany"};
    private int maxTransactionAmount = 5000;

    @Override
    public boolean isFraud(Transaction t) {
        for (String s : prohibitedCountries) {
            return s.equals(t.getTrader().getCountry()) && t.getAmount() > maxTransactionAmount;
        }
        return false;
    }
}