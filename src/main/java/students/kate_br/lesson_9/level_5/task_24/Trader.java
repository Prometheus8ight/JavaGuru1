package students.kate_br.lesson_9.level_5.task_24;

 class Trader {

     private String fullName;
     private String city;
     private String country;

     public Trader(String fullName, String city, String country) {
         this.fullName = fullName;
         this.city = city;
         this.country = country;
     }

     public String getCountry() {
         return country;
     }

     public String getCity() {
         return city;
     }

     public String getFullName() {
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

     public int getAmount() {
         return amount;
     }

     public Trader getTrader() {
         return trader;
     }
 }
