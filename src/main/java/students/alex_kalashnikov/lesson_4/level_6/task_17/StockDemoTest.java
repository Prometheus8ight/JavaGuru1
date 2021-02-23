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
        int realResult = stockTest.maxPrice;
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
        stockTest.maxPrice = stockTest.currentPrice;
        stockTest.updatePrice(1);
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
        stockTest.maxPrice = stockTest.currentPrice;
        stockTest.updatePrice(2);
        stockTest.updatePrice(1000);
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
        stockTest.maxPrice = stockTest.currentPrice;
        stockTest.updatePrice(2);
        stockTest.updatePrice(1000);
        stockTest.updatePrice(8);
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
        stockTest.maxPrice = stockTest.currentPrice;
        stockTest.updatePrice(27);
        int realResult = stockTest.maxPrice;
        if (realResult == expectedResult) {
            System.out.println("maxPriceTest4 is OK");
        }
        else {
            System.out.println("maxPriceTest4 is FAILED");
        }
    }

}