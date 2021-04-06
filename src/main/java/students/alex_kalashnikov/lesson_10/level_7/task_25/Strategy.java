package students.alex_kalashnikov.lesson_10.level_7.task_25;

class Strategy {

    private FraudRule fraudRule;

    public Strategy(FraudRule fraudRule) {
        this.fraudRule = fraudRule;
    }

    boolean executeFraudRule(Transaction t) {
        return fraudRule.isFraud(t);
    }

}