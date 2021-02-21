package students.kate_br.lesson_4.level_6.task_17;

 class StockTest {

     public static void main(String[] args) {

         StockTest test = new StockTest();
         test.updateMaxPriceTest();
         test.updateMinPriceTest();


     }

     public void updateMaxPriceTest(){
         int maxPrice = 15;
         int minPrice = 7;
         int expectedResult = 15;
         Stock stock = new Stock("GOOG", 10);
         String realResult = stock.getPriceInformation();

         if (maxPrice > minPrice){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }

     public void updateMinPriceTest(){
         int maxPrice = 15;
         int minPrice = 7;
         int expectedResult = 7;
         Stock stock = new Stock("GOOG", 10);
         String realResult = stock.getPriceInformation();

         if(maxPrice > minPrice){
             System.out.println("Test OK");
         }else{
             System.out.println("Test FAIL");
         }
     }
}
