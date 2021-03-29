package students.kate_br.lesson_9.level_5.task_26;

 class Trader {

     private String city;

     public Trader(String city) {
         this.city = city;
     }

     public String getCity() {
         return city;
     }
 }

 class Transaction {

     private Trader trader;

     public Transaction(Trader trader) {
         this.trader = trader;
     }

     public Trader getTrader() {
         return trader;
     }
 }
