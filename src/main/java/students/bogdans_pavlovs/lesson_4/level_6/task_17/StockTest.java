package students.bogdans_pavlovs.lesson_4.level_6.task_17;

class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();

        stockTest.testPriceUpdate();
        stockTest.testMaxPrice1();
        stockTest.testMaxPrice2();
        stockTest.testMaxPrice3();
        stockTest.testMaxPrice4();
        stockTest.testMaxPrice5();

    }

    //10 -> 12 -> 5 -> 7 -> 99 -> 77
    public void testPriceUpdate(){

        int expectedCurrent = 77;
        int expectedMin = 5;
        int expectedMax = 99;

        Stock testStock = new Stock("Test", 10);
        testStock.updatePrice(12);
        testStock.updatePrice(5);
        testStock.updatePrice(7);
        testStock.updatePrice(99);
        testStock.updatePrice(77);

        int realCurrent = testStock.currentPrice;
        int realMin = testStock.minPrice;
        int realMax = testStock.maxPrice;

        if (realCurrent == expectedCurrent){
            System.out.println("Current Price test = OK");
        } else {
            System.out.println("Current Price test = FAIL");
        }

        if (realMin == expectedMin){
            System.out.println("Min Price test = OK");
        } else {
            System.out.println("Min Price test = FAIL");
        }

        if (realMax == expectedMax){
            System.out.println("Max Price test = OK");
        } else {
            System.out.println("Max Price test = FAIL");
        }

    }

    //Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
    public void testMaxPrice1(){

        int expectedResult = 999;

        Stock testStock = new Stock("Test", 999);

        int realResult = testStock.maxPrice;

        if(expectedResult == realResult){
            System.out.println("Max Price test 1 = OK");
        } else {
            System.out.println("Max Price test 1 = FAIL");
        }


    }

    //Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
    public void testMaxPrice2(){

        int expectedResult = 999;

        Stock testStock = new Stock("Test", 999);
        testStock.updatePrice(1);

        int realResult = testStock.maxPrice;

        if(expectedResult == realResult){
            System.out.println("Max Price test 2 = OK");
        } else {
            System.out.println("Max Price test 2 = FAIL");
        }


    }

    //Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
    public void testMaxPrice3(){

        int expectedResult = 1000;

        Stock testStock = new Stock("Test", 999);
        testStock.updatePrice(2);
        testStock.updatePrice(1000);

        int realResult = testStock.maxPrice;

        if(expectedResult == realResult){
            System.out.println("Max Price test 3 = OK");
        } else {
            System.out.println("Max Price test 3 = FAIL");
        }


    }

    //Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
    public void testMaxPrice4(){

        int expectedResult = 1000;

        Stock testStock = new Stock("Test", 999);
        testStock.updatePrice(2);
        testStock.updatePrice(1000);
        testStock.updatePrice(8);

        int realResult = testStock.maxPrice;

        if(expectedResult == realResult){
            System.out.println("Max Price test 4 = OK");
        } else {
            System.out.println("Max Price test 4 = FAIL");
        }


    }

    //Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27
    public void testMaxPrice5(){

        int expectedResult = 27;

        Stock testStock = new Stock("Test", 9);
        testStock.updatePrice(27);

        int realResult = testStock.maxPrice;

        if(expectedResult == realResult){
            System.out.println("Max Price test 5 = OK");
        } else {
            System.out.println("Max Price test 5 = FAIL");
        }


    }

}
