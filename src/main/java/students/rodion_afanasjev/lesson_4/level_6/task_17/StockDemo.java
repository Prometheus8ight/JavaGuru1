package students.rodion_afanasjev.lesson_4.level_6.task_17;

public class StockDemo {

    public static void main(String[] args) {

        Stock netflix = new Stock("Netflix", 10);
        netflix.updatePrice(15);
        netflix.updatePrice(7);
        netflix.updatePrice(14);
        netflix.updatePrice(65);
        netflix.updatePrice(84);
        netflix.updatePrice(79);
        String priceInformation =  netflix.getPriceInformation();
        System.out.println(priceInformation);


        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest();

    }
}
