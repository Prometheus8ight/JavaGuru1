package students.kate_br.lesson_9.level_4.task_17;

 class Trader {

     private String fullName;
     private String city;

     public Trader(String fullName, String city) {
         this.fullName = fullName;
         this.city = city;
     }

     public String getFullName(){
         return fullName;
     }
 }

 class Transaction {

     private Trader trader;
     private int amount;

     public Transaction(Trader trader, int amount) {
         this.trader = trader;
         this.amount = amount;
     }

     public Trader getTrader(){
         return trader;
     }
 }

 class FraudDetector{

     boolean isFraud(Transaction t){

         if (t.getTrader().getFullName().contains("Pokemon")){
             return true;
         }
         return false;
     }
 }

