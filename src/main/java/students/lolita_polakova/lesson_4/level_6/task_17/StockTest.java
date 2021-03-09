package students.lolita_polakova.lesson_4.level_6.task_17;

class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.maxPrice();
        stockTest.minPrice();
    }

    public void maxPrice() {
        int currentPrice = 10;
        int expectedResult = 10;

        Stock stock = new Stock("Apricot", 10);
        stock.updatePrice(currentPrice);
        int realResult = stock.maxPrice;

        if (realResult == expectedResult) {
            System.out.println("Max Price Test = OK");
        } else {
            System.out.println("Max Price Test = FAIL");
        }

        currentPrice = 12;
        expectedResult = 12;
        stock.updatePrice(currentPrice);
        realResult = stock.maxPrice;

        if (realResult == expectedResult) {
            System.out.println("Max Price Test = OK");
        } else {
            System.out.println("Max Price Test = FAIL");
        }

        currentPrice = 5;
        expectedResult = 12;
        stock.updatePrice(currentPrice);
        realResult = stock.maxPrice;

        if (realResult == expectedResult) {
            System.out.println("Max Price Test = OK");
        } else {
            System.out.println("Max Price Test = FAIL");
        }

        currentPrice = 7;
        expectedResult = 12;
        stock.updatePrice(currentPrice);
        realResult = stock.maxPrice;

        if (realResult == expectedResult) {
            System.out.println("Max Price Test = OK");
        } else {
            System.out.println("Max Price Test = FAIL");
        }

        currentPrice = 99;
        expectedResult = 99;
        stock.updatePrice(currentPrice);
        realResult = stock.maxPrice;

        if (realResult == expectedResult) {
            System.out.println("Max Price Test = OK");
        } else {
            System.out.println("Max Price Test = FAIL");
        }

        currentPrice = 77;
        expectedResult = 99;
        stock.updatePrice(currentPrice);
        realResult = stock.maxPrice;

        if (realResult == expectedResult) {
            System.out.println("Max Price Test = OK");
        } else {
            System.out.println("Max Price Test = FAIL");
        }
    }

    public void minPrice() {
        int currentPrice = 10;
        int expectedResult = 10;

        Stock stock = new Stock("Apricot", 10);
        stock.updatePrice(currentPrice);
        int realResult = stock.minPrice;

        if (realResult == expectedResult) {
            System.out.println("Min Price Test = OK");
        } else {
            System.out.println("Min Price Test = FAIL");
        }

        currentPrice = 12;
        expectedResult = 10;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;

        if (realResult == expectedResult) {
            System.out.println("Min Price Test = OK");
        } else {
            System.out.println("Min Price Test = FAIL");
        }

        currentPrice = 5;
        expectedResult = 5;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;

        if (realResult == expectedResult) {
            System.out.println("Min Price Test = OK");
        } else {
            System.out.println("Min Price Test = FAIL");
        }

        currentPrice = 7;
        expectedResult = 5;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;

        if (realResult == expectedResult) {
            System.out.println("Min Price Test = OK");
        } else {
            System.out.println("Min Price Test = FAIL");
        }

        currentPrice = 99;
        expectedResult = 5;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;

        if (realResult == expectedResult) {
            System.out.println("Min Price Test = OK");
        } else {
            System.out.println("Min Price Test = FAIL");
        }

        currentPrice = 77;
        expectedResult = 5;
        stock.updatePrice(currentPrice);
        realResult = stock.minPrice;

        if (realResult == expectedResult) {
            System.out.println("Min Price Test = OK");
        } else {
            System.out.println("Min Price Test = FAIL");
        }
    }
}
