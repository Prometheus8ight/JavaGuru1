package students.kate_br.lesson_9.level_5.task_25;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    abstract boolean isFraud(Transaction t);
}
