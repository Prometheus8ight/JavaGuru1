package students.rodion_afanasjev.lesson_9.level_5.task_22;

class Rule1 extends FraudRule {

    public Rule1(String ruleName){
        super(ruleName);
    }

    public boolean isFraud(Transaction t){
        return t.getTrader().getFullName().equals("Pokemon");
    }

}
