package students.deniss_jankovskis.lesson_4.level_6;

class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.minPriceTest();
        stockTest.maxPriceTest();

    }

    public void minPriceTest() {

        int currentPrice = 10;
        int expectedResult = 10;
        Stock stock = new Stock("GOOGLE", 10);
        stock.updatePrice(currentPrice);
        int realResult = stock.minPrice;
        check(realResult, expectedResult, "Minimum price");


        currentPrice = 12;
        expectedResult = 12;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult, "Minimum price");


        currentPrice = 5;
        expectedResult = 12;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult, "Minimum price");


        currentPrice = 7;
        expectedResult = 12;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult, "Minimum price");


        currentPrice = 99;
        expectedResult = 99;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult, "Minimum price");


        currentPrice = 77;
        expectedResult = 99;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult, "Minimum price");

    }


    public void maxPriceTest() {

        int currentPrice = 10;
        int expectedResult = 10;
        Stock stock = new Stock("GOOGLE", 10);
        stock.updatePrice(currentPrice);
        int realResult = stock.minPrice;
        check(realResult, expectedResult, "Maximum price");


        currentPrice = 12;
        expectedResult = 12;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult, "Maximum price");


        currentPrice = 5;
        expectedResult = 12;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult, "Maximum price");


        currentPrice = 7;
        expectedResult = 12;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult, "Maximum price");


        currentPrice = 12;
        expectedResult = 12;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult, "Maximum price");


        currentPrice = 99;
        expectedResult = 99;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult, "Maximum price");


        currentPrice = 77;
        expectedResult = 99;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult, "Maximum price");


    }

    public void check(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " has passed");
        }
        else {
            System.out.println(testName + " has failed");
        }
    }


}
