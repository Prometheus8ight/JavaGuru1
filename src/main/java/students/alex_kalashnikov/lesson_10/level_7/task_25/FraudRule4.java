package students.alex_kalashnikov.lesson_10.level_7.task_25;

class FraudRule4 implements FraudRule {

    private String[] prohibitedCountries = {"Jamaica"};

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