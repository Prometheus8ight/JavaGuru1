package students.alex_kalashnikov.lesson_10.level_7.task_25;

class FraudRule1 implements FraudRule {

    private String[] fraudList = {"Pokemon"};

    @Override
    public boolean isFraud(Transaction t) {
        for (String s : fraudList) {
            if (s.equals(t.getTrader().getFullName())) {
                return true;
            }
        }
        return false;
    }
}