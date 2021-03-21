package students.rodion_afanasjev.lesson_9.level_6.task_30;

class Rule2 extends FraudRule{

    public Rule2(String ruleName){
        super(ruleName);
    }

    public boolean isFraud(Transaction t){
        return t.getAmount() > 1000000;
    }

}
