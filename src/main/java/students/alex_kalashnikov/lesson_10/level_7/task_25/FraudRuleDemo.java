package students.alex_kalashnikov.lesson_10.level_7.task_25;

class FraudRuleDemo {

    public static void main(String[] args) {

        Strategy newStrategy = new Strategy(new FraudRule1());
        newStrategy.executeFraudRule(new Transaction(new Trader("Pokemon", "Riga", "Latvia"), 500000));

        newStrategy = new Strategy(new FraudRule3());
        newStrategy.executeFraudRule(new Transaction(new Trader("Alex", "Riga", "Latvia"), 5000));


    }

}