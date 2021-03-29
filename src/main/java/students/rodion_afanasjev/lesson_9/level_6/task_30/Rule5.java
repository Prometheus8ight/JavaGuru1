package students.rodion_afanasjev.lesson_9.level_6.task_30;

class Rule5 extends FraudRule{

    public Rule5(String ruleName){
        super(ruleName);
    }

    public boolean isFraud(Transaction t){
        return t.getTrader().getCity().equals("Германия") && t.getAmount() > 1000;
    }

}
