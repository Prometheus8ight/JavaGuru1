package students.alex_kalashnikov.lesson_9.level_6.task_32;

class FraudDetector {

    private FraudRule[] allRules = {new FraudRule1("Trader name rule"),
            new FraudRule2("Max amount rule", 1000000),
            new FraudRule3("Prohibited cities rule"), new FraudRule4("Prohibited countries rule"),
            new FraudRule5("Country transaction amount limit rule", 5000)};

    public FraudDetectionResult[] isFraud2(Transaction t) {
        int count = 0;
        for (FraudRule allRule : allRules) {
            if (allRule.isFraud(t)) {
                count++;
            }
        }
        FraudDetectionResult[] arr = new FraudDetectionResult[count];
        int j = 0;
        for (FraudRule allRule : allRules) {
            if (allRule.isFraud(t)) {
                FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(true, allRule.getRuleName());
                arr[j] = fraudDetectionResult;
                j++;
            }
        }
        return arr;
    }

}