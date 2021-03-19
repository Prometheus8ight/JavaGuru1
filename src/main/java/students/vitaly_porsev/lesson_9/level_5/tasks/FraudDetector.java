package students.vitaly_porsev.lesson_9.level_5.tasks;

class FraudDetector {

    FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(FraudRule[] fraudRules, Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
           if(fraudRule.isFraud(t)){
               return true;
           }
        }return false;
    }
}
