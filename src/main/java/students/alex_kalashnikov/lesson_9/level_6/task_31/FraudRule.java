package students.alex_kalashnikov.lesson_9.level_6.task_31;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public boolean isFraud(Transaction t) {
        return false;
    }

    String getRuleName(FraudDetectionResult result){
        return result.getRuleName();
    }

}