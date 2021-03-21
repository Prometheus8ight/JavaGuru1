package students.vitaly_porsev.lesson_9.level_6.allTasks;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;
    private Transaction transaction;

    public FraudDetectionResult(boolean fraud, String ruleName, Transaction transaction) {
        this.fraud = fraud;
        this.ruleName = ruleName;
        this.transaction = transaction;
    }

    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public String toString() {
        return "FraudDetectionResult{" +
                "fraud=" + fraud +
                ", ruleName='" + ruleName + '\'' +
                ", transaction=" + transaction +
                '}';
    }
}
