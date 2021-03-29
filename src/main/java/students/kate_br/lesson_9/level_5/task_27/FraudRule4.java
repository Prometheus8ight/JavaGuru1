package students.kate_br.lesson_9.level_5.task_27;

 class FraudRule4 extends FraudRule {

     public FraudRule4(String ruleName) {
         super(ruleName);
     }

     @Override
     boolean isFraud(Transaction t) {
         if (t.getTrader().getCity().contains("Jamaica")){
             return true;
         }
         return false;
     }
 }
