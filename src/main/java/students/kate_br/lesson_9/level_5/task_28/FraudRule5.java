package students.kate_br.lesson_9.level_5.task_28;

 class FraudRule5 extends FraudRule {

     public FraudRule5(String ruleName) {
         super(ruleName);
     }

     @Override
     boolean isFraud(Transaction t) {
         if (t.getAmount() > 1000 && t.getTrader().getCountry().contains("Germany")){
             return true;
         }
         return false;
     }
 }
