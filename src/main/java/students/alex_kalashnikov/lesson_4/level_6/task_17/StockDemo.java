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

        google.currentPrice = google.updatePrice();
        {google.currentPrice = 12;}
        google.setMaxPrice(google.currentPrice);
        google.setMinPrice(google.currentPrice);

        google.currentPrice = google.updatePrice();
        {google.currentPrice = 5;}
        google.setMaxPrice(google.currentPrice);
        google.setMinPrice(google.currentPrice);

        google.currentPrice = google.updatePrice();
        {google.currentPrice = 7;}
        google.setMaxPrice(google.currentPrice);
        google.setMinPrice(google.currentPrice);

        google.currentPrice = google.updatePrice();
        {google.currentPrice = 99;}
        google.setMaxPrice(google.currentPrice);
        google.setMinPrice(google.currentPrice);

        google.currentPrice = google.updatePrice();
        {google.currentPrice = 77;}
        google.setMaxPrice(google.currentPrice);
        google.setMinPrice(google.currentPrice);


        /*
        if (google.currentPrice > google.maxPrice) {
            google.maxPrice = google.currentPrice;
        }
        if (google.currentPrice < google.minPrice) {
            google.minPrice = google.currentPrice;
        }

        google.currentPrice = google.updatePrice();
        {google.currentPrice = 5;}
        if (google.currentPrice > google.maxPrice) {
            google.maxPrice = google.currentPrice;
        }
        if (google.currentPrice < google.minPrice) {
            google.minPrice = google.currentPrice;
        }

        google.currentPrice = google.updatePrice();
        {google.currentPrice = 7;}
        if (google.currentPrice > google.maxPrice) {
            google.maxPrice = google.currentPrice;
        }
        if (google.currentPrice < google.minPrice) {
            google.minPrice = google.currentPrice;
        }

        google.currentPrice = google.updatePrice();
        {google.currentPrice = 99;}
        if (google.currentPrice > google.maxPrice) {
            google.maxPrice = google.currentPrice;
        }
        if (google.currentPrice < google.minPrice) {
            google.minPrice = google.currentPrice;
        }

        google.currentPrice = google.updatePrice();
        {google.currentPrice = 77;}
        if (google.currentPrice > google.maxPrice) {
            google.maxPrice = google.currentPrice;
        }
        if (google.currentPrice < google.minPrice) {
            google.minPrice = google.currentPrice;
        }

    */
        priceInformation = google.getPriceInformation(); {
            System.out.println(priceInformation);
        }
    }


    }