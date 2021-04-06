package students.alex_kalashnikov.lesson_10.level_7.task_25;

class FraudRule2 implements FraudRule {

    private int maxTransactionAmount = 1000000;

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > maxTransactionAmount;
    }

}