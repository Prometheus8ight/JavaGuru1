package main.java.students.julija_katukova.lesson_9.level_5;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Германия") && t.getAmount() > 1000 ||
                t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000;
    }
}
