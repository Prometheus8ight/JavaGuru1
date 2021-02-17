package students.rodion_afanasjev.lesson_4.level_6.task_17;

class StockTest {

    public void updatePriceTest(){
        int expectedResult = 14;
        int expectedMin = 7;
        int expectedMax = 15;

        Stock netflix = new Stock("Netflix", 10);
        netflix.updatePrice(15);
        netflix.updatePrice(7);
        netflix.updatePrice(14);
        netflix.getPriceInformation();

        int realResult = netflix.currentPrice;
        int realMin = netflix.minPrice;
        int realMax = netflix.maxPrice;

        if (realResult == expectedResult){
            System.out.println("Current Price Success");
        } else {
            System.out.println("Current Price FAIL");
        }

        if (realMin == expectedMin){
            System.out.println("Min Price test Success");
        } else {
            System.out.println("Min Price test FAIL");
        }

        if (realMax == expectedMax){
            System.out.println("Max Price test Success");
        } else {
            System.out.println("Max Price test FAIL");
        }
    }
}
