package students.alex_kalashnikov.lesson_9.level_5.task_28;

class FraudRule1 extends FraudRule {

    private String[] fraudList = {"Pokemon"};

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

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