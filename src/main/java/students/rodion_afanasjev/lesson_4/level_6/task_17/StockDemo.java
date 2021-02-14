package students.rodion_afanasjev.lesson_4.level_6.task_17;

public class StockDemo {

    public static void main(String[] args) {

        Stock netflix = new Stock("Netflix", 10);
        netflix.getPriceInformation();

        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest();

    }
}
