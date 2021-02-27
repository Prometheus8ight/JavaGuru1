package students.arkadij.lesson_4.task_17;

class StockDemo {

    public static void main(String[] args) {
        Stock google = new Stock("Google", 10);
        google.updatePrice(20);
        google.updatePrice(17);
        google.updatePrice(25);
        google.updatePrice(15);
        google.updatePrice(33);
        google.updatePrice(57);
        google.updatePrice(44);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);


        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest();
    }

}
