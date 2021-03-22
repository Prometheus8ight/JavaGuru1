package students.kate_br.lesson_9.level_5.task_26;

 class FraudRule3 extends FraudRule {

     public FraudRule3(String ruleName) {
         super(ruleName);
     }

     @Override
     boolean isFraud(Transaction t) {
         if (t.getTrader().getCity().contains("Sydney")){
             return true;
         }
         return false;
     }
 }
