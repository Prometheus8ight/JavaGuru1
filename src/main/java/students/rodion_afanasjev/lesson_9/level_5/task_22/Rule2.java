package students.rodion_afanasjev.lesson_9.level_5.task_22;

class Rule2 extends FraudRule{

    public Rule2(String ruleName){
        super(ruleName);
    }

    public boolean isFraud(Transaction t){
        return t.getAmount() > 1000000;
    }

}
