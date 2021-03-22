package students.alex_kalashnikov.lesson_9.level_4.task_17;

class FraudDetector {

    private String[] fraudList = {"Pokemon"};

    boolean isFraud(Transaction t) {
        for (int i = 0; i < fraudList.length; i++) {
            if (fraudList[i].equals(t.getTrader().getFullName())) {
                return true;
            }
        }
        return false;
    }

}