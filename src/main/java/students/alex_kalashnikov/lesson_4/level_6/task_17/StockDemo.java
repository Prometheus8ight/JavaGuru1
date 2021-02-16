package students.alex_kalashnikov.lesson_4.level_6.task_17;

class StockDemo {

    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10);
        google.minPrice = google.currentPrice;
        google.maxPrice = google.currentPrice;
        String priceInformation = google.getPriceInformation();
        {
            System.out.println(priceInformation);
        }
        google.currentPrice = 12;
        google.currentPrice = google.updatePrice();

        google.currentPrice = 5;
        google.currentPrice = google.updatePrice();

        google.currentPrice = 7;
        google.currentPrice = google.updatePrice();

        google.currentPrice = 99;
        google.currentPrice = google.updatePrice();

        google.currentPrice = 77;
        google.currentPrice = google.updatePrice();


        priceInformation = google.getPriceInformation(); {
            System.out.println(priceInformation);
        }
    }

}