package students.alex_kalashnikov.lesson_9.level_6.task_33;

import java.util.Objects;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public boolean isFraud() {
        return fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    @Override
    public String toString() {
        return "Fraud Detection Result{" +
                "Result='" + fraud + '\'' +
                ", Rule name='" + ruleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FraudDetectionResult fraudDetectionResult = (FraudDetectionResult) o;
        return Objects.equals(ruleName, fraudDetectionResult.ruleName);
    }

}