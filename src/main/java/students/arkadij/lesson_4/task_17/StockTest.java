package students.arkadij.lesson_4.task_17;

class StockTest {

    public void updatePriceTest(){
        int supposedResult = 20;
        int supposedMax = 25;
        int supposedMin = 9;

        Stock google = new Stock("Google", 10);
        google.updatePrice(25);
        google.updatePrice(9);
        google.updatePrice(20);
        google.getPriceInformation();

        int realResult = google.currentPrice;
        int realMin = google.minPrice;
        int realMax = google.maxPrice;

        if (realResult == supposedResult){
            System.out.println("Current price test - OK!");
        } else {
            System.out.println("Current price test - FAIL!");
        }
        if (realMin == supposedMin){
            System.out.println("Min price test - OK!");
        } else {
            System.out.println("Min price test - FAIL!");
        }
        if (realMax == supposedMax){
            System.out.println("Max price test - OK!");
        } else {
            System.out.println("Max price test - FAIL!");
        }

    }

}
