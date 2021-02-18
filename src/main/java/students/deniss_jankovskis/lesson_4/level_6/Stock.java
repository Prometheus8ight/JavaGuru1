package students.deniss_jankovskis.lesson_4.level_6;

class Stock {

    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;


    Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;

    }


    public void updatePrice(int currentPrice) {
        if (currentPrice > maxPrice) {
            maxPrice = currentPrice;
        }
        if (currentPrice < minPrice) {
            minPrice = currentPrice;
        }

    }

    public String getPriceInformation() {
        String com = "Company Name = " + companyName + ",";
        String cur = " Current Price = " + currentPrice + ",";
        String min = " Min Price = " + minPrice + ",";
        String max = " Max Price = " + maxPrice + " ";
        return com + cur + min + max;
    }


    public static void main(String[] args) {

        Stock google = new Stock("GOOGLE", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

    }


}
