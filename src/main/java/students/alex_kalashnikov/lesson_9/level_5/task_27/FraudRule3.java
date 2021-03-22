package students.alex_kalashnikov.lesson_9.level_5.task_27;

class FraudRule3 extends FraudRule {

    private String[] prohibitedCities = {"Sydney"};

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        for (String s : prohibitedCities) {
            if (s.equals(t.getTrader().getCity())) {
                return true;
            }
        }
        return false;
    }
}