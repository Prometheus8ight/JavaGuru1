package students.alex_kalashnikov.lesson_10.level_7.task_25;

class FraudRule3 implements FraudRule {

    private String[] prohibitedCities = {"Sydney"};

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