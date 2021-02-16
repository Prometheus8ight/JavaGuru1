package students.alex_kalashnikov.lesson_4.level_6.task_17;

class StockDemoTest {

    public static void main(String[] args) {

        StockDemoTest stockDemoTest = new StockDemoTest();
        stockDemoTest.maxPriceTest();
        stockDemoTest.maxPriceTest1();
        stockDemoTest.maxPriceTest2();
        stockDemoTest.maxPriceTest3();
        stockDemoTest.maxPriceTest4();
    }

    public void maxPriceTest() {

        int expectedResult = 999;
        Stock stockTest = new Stock("GOOG",999);
        stockTest.maxPrice = stockTest.currentPrice;
        int realResult = stockTest.updatePrice();
        if (realResult == expectedResult) {
            System.out.println("maxPriceTest is OK");
        }
        else {
            System.out.println("maxPriceTest is FAILED");
        }

    }

    public void maxPriceTest1() {

        int expectedResult = 999;
        Stock stockTest = new Stock("GOOG",999);
        stockTest.maxPrice = stockTest.currentPrice; {stockTest.currentPrice = 1;}
        stockTest.currentPrice = stockTest.updatePrice();
        int realResult = stockTest.maxPrice;
        if (realResult == expectedResult) {
            System.out.println("maxPriceTest1 is OK");
        }
        else {
            System.out.println("maxPriceTest1 is FAILED");
        }

    }

    public void maxPriceTest2() {

        int expectedResult = 1000;
        Stock stockTest = new Stock("GOOG",999);
        stockTest.maxPrice = stockTest.currentPrice; {stockTest.currentPrice = 2;}
        stockTest.currentPrice = stockTest.updatePrice(); {stockTest.currentPrice = 1000;}
        stockTest.currentPrice = stockTest.updatePrice();
        int realResult = stockTest.maxPrice;
        if (realResult == expectedResult) {
            System.out.println("maxPriceTest2 is OK");
        }
        else {
            System.out.println("maxPriceTest2 is FAILED");
        }

    }

    public void maxPriceTest3() {

        int expectedResult = 1000;
        Stock stockTest = new Stock("GOOG",999);
        stockTest.maxPrice = stockTest.currentPrice; {stockTest.currentPrice = 2;}
        stockTest.currentPrice = stockTest.updatePrice(); {stockTest.currentPrice = 1000;}
        stockTest.currentPrice = stockTest.updatePrice(); {stockTest.currentPrice = 8;}
        stockTest.currentPrice = stockTest.updatePrice();
        int realResult = stockTest.maxPrice;
        if (realResult == expectedResult) {
            System.out.println("maxPriceTest3 is OK");
        }
        else {
            System.out.println("maxPriceTest3 is FAILED");
        }

    }

    public void maxPriceTest4() {

        int expectedResult = 27;
        Stock stockTest = new Stock("GOOG",9);
        stockTest.maxPrice = stockTest.currentPrice; {stockTest.currentPrice = 27;}
        stockTest.currentPrice = stockTest.updatePrice();
        int realResult = stockTest.maxPrice;
        if (realResult == expectedResult) {
            System.out.println("maxPriceTest4 is OK");
        }
        else {
            System.out.println("maxPriceTest4 is FAILED");
        }

    }

}
