package students.rodion_afanasjev.lesson_9.level_5.task_22;

class Rule4 extends FraudRule{

    public Rule4(String ruleName){
        super(ruleName);
    }

    public boolean isFraud(Transaction t){
        return t.getTrader().getCity().equals("Ямайка");
    }

}
