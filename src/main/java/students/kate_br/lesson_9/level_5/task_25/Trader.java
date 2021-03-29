package students.kate_br.lesson_9.level_5.task_25;

 class Trader {

     private String fullName;
     private String city;

     public Trader(String fullName, String city) {
         this.fullName = fullName;
         this.city = city;
     }
 }

 class Transaction {

     private Trader trader;
     private int amount;

     public Transaction(Trader trader, int amount) {
         this.trader = trader;
         this.amount = amount;
     }

     public int getAmount() {
         return amount;
     }
 }
