package students.kate_br.lesson_9.level_5.task_24;

 class FraudRule1 extends FraudRule {


     public FraudRule1(String ruleName) {
         super(ruleName);
     }

     @Override
     boolean isFraud(Transaction t) {
          if (t.getTrader().getFullName().contains("Pokemon")){
              return true;
          }

          return false;
     }
 }
