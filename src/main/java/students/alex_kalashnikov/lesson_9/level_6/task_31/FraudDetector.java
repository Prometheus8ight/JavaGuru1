package students.alex_kalashnikov.lesson_9.level_6.task_31;

class FraudDetector {

    private FraudRule[] allRules = {new FraudRule1("Trader name rule"),
            new FraudRule2("Max amount rule", 1000000),
            new FraudRule3("Prohibited cities rule"), new FraudRule4("Prohibited countries rule"),
            new FraudRule5("Country transaction amount limit rule", 5000)};

    public boolean isFraud2(Transaction t) {
        for (int i = 0; i < allRules.length; i++) {
            if (allRules[i].isFraud(t)) {
                return true;
            }
        }
        return false;
    }

}