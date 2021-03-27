package students.kate_br.lesson_9.level_5.task_28;

 class Trader {

     private String country;

     public Trader(String country) {
         this.country = country;
     }

     public String getCountry() {
         return country;
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
