package students.alex_kalashnikov.lesson_9.level_5.task_29;

class FraudRule4 extends FraudRule {

    private String[] prohibitedCountries = {"Jamaica"};

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        for (String s : prohibitedCountries) {
            if (s.equals(t.getTrader().getCountry())) {
                return true;
            }
        }
        return false;
    }
}