package students.kate_br.lesson_9.level_5.task_25;

 class FraudRule2 extends FraudRule {

     public FraudRule2(String ruleName) {
         super(ruleName);
     }

     @Override
     boolean isFraud(Transaction t) {
         if (t.getAmount() > 1000000){
             return true;
         }
         return false;
     }
 }
