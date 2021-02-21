package students.kate_br.lesson_4.level_6.task_17;

 class Stock {

     String name;
     int currentPrice;
     int maxPrice;
     int minPrice;



     public void updatePrice(int newPrice) {

         if (newPrice > maxPrice) {
             maxPrice = newPrice;
         } else if (newPrice < minPrice) {
             minPrice = newPrice;
         }else {
             currentPrice = newPrice;
         }

     }



     Stock(String name, int currentPrice) {

         this.name = name;
         this.currentPrice = currentPrice;
         this.maxPrice = currentPrice;
         this.minPrice = currentPrice;
     }


     public String getPriceInformation() {

         String company = "Company = " + this.name + " ";
         String current = "Current price = " + this.currentPrice + " ";
         String minPrice = "Min price = " + this.minPrice + " ";
         String maxPrice = "Max price = " + this.maxPrice + " ";
         return company + current + minPrice + maxPrice;

     }

 }



