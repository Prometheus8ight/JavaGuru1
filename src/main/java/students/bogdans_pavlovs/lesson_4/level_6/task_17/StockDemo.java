package students.bogdans_pavlovs.lesson_4.level_6.task_17;

class StockDemo {

    public static void main(String[] args) {

        Stock gameStop = new Stock("GME", 5);

        String priceInformation = gameStop.getPriceInformation();
        System.out.println(priceInformation);

        gameStop.updatePrice(20);
        gameStop.updatePrice(17);
        gameStop.updatePrice(4);
        gameStop.updatePrice(16);

        priceInformation = gameStop.getPriceInformation();
        System.out.println(priceInformation);



    }

}
