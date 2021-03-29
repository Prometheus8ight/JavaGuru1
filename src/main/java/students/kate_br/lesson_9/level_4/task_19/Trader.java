package students.kate_br.lesson_9.level_4.task_19;

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

     public String getCity() {
         return city;
     }
 }

 class Transaction {

     private Trader trader;
     private int amount;

     public Transaction(Trader trader, int amount) {
         this.trader = trader;
         this.amount = amount;
     }

     public Trader getTrader() {
         return trader;
     }

     public int getAmount() {
         return amount;
     }
 }

 class FraudDetector{

     boolean isFraud(Transaction t){
         if (t.getTrader().getFullName().contains("Pokemon")){
             return true;
         }

         if (t.getAmount() > 1000000){
             return true;
         }

         if (t.getTrader().getCity().contains("Sydney")){
             return true;
         }
         return false;
     }
 }
