package students.alex_kalashnikov.lesson_9.level_4.task_18;

class FraudDetector {

    private String[] fraudList = {"Pokemon"};
    private int maxTransactionAmount = 1000000;

    boolean isFraud(Transaction t) {
        for (int i = 0; i < fraudList.length; i++) {
            if (fraudList[i].equals(t.getTrader().getFullName())) {
                return true;
            }
        }
        return false;
    }

    boolean isExcessAmount(Transaction t) {
        return t.getAmount() > maxTransactionAmount;
    }

}