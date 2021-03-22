package students.kate_br.lesson_9.level_4.task_21;

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

     public String getFullName() {
         return fullName;
     }

     public String getCity() {
         return city;
     }
 }

 class Transaction{

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

         if (t.getTrader().getCity().contains("Jamaica")){
             return true;
         }

         if (t.getTrader().getCountry().contains("Germany") && t.getAmount() > 1000){
             return true;
         }

         return false;
     }
 }
