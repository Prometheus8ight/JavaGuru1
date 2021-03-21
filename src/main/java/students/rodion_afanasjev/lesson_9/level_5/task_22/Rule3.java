package students.rodion_afanasjev.lesson_9.level_5.task_22;

class Rule3 extends FraudRule{

    public Rule3(String ruleName){
        super(ruleName);
    }

    public boolean isFraud(Transaction t){
        return t.getTrader().getCity().equals("Сидней");
    }

}
