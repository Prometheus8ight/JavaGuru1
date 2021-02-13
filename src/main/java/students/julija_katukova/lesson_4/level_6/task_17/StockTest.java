package students.julija_katukova.lesson_4.level_6.task_17;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.maxPriceTest();
        stockTest.minPriceTest();
    }

    public void maxPriceTest() {
        int stockCurrentPrice = 10;
        int expectedResult =  10;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(stockCurrentPrice);
        int realResult = stock.maxPrice;
        check(realResult, expectedResult,"Max");

        stockCurrentPrice = 12;
        expectedResult =  12;
        stock.updatePrice(stockCurrentPrice);
        realResult = stock.maxPrice;
        check(realResult, expectedResult,"Max");

        stockCurrentPrice = 5;
        expectedResult =  12;
        stock.updatePrice(stockCurrentPrice);
        realResult = stock.maxPrice;
        check(realResult, expectedResult,"Max");

        stockCurrentPrice = 7;
        expectedResult =  12;
        stock.updatePrice(stockCurrentPrice);
        realResult = stock.maxPrice;
        check(realResult, expectedResult,"Max");

        stockCurrentPrice = 99;
        expectedResult =  99;
        stock.updatePrice(stockCurrentPrice);
        realResult = stock.maxPrice;
        check(realResult, expectedResult,"Max");

        stockCurrentPrice = 77;
        expectedResult = 99;
        stock.updatePrice(stockCurrentPrice);
        realResult = stock.maxPrice;
        check(realResult, expectedResult,"Max");
    }

    public void minPriceTest() {
        int stockCurrentPrice = 10;
        int expectedResult =  10;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(stockCurrentPrice);
        int realResult = stock.minPrice;
        check(realResult, expectedResult,"Min");

        stockCurrentPrice = 12;
        expectedResult =  10;
        stock.updatePrice(stockCurrentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult,"Min");

        stockCurrentPrice = 5;
        expectedResult =  5;
        stock.updatePrice(stockCurrentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult,"Min");

        stockCurrentPrice = 7;
        expectedResult =  5;
        stock.updatePrice(stockCurrentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult,"Min");

        stockCurrentPrice = 99;
        expectedResult =  5;
        stock.updatePrice(stockCurrentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult,"Min");

        stockCurrentPrice = 77;
        expectedResult =  5;
        stock.updatePrice(stockCurrentPrice);
        realResult = stock.minPrice;
        check(realResult, expectedResult,"Min");
    }

    public void check(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " test = OK");
        }
        else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
