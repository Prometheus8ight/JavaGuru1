package students.rodion_afanasjev.lesson_4.level_6.task_17;

public class StockDemo {

    public static void main(String[] args) {

        Stock google = new Stock("google",10);
        google.getPriceInformation();

        google.updatePrice(9);
        google.updatePrice(68);
        google.updatePrice(55);

        google.getPriceInformation();

        StockTest stockTest = new StockTest();
        stockTest.maxTest();

    }
}
