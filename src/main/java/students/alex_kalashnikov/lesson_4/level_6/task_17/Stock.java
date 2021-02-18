package students.alex_kalashnikov.lesson_4.level_6.task_17;

class Stock {

    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;
    int finalCurrentPrice;

    Stock(String stockName, int currentPrice) {
        this.name = stockName;
        this.currentPrice = currentPrice;
    }

    void updatePrice(int currentPrice) {
        finalCurrentPrice = currentPrice;
        if (currentPrice < minPrice) {
            minPrice = currentPrice;
        } else if (currentPrice > maxPrice) {
            maxPrice = currentPrice;
        }
    }

    String getPriceInformation() {
        return "Company = " + name + ", " + "Current price = " + finalCurrentPrice + ", " + "Max price = " + maxPrice + ", " + "Min price = " + minPrice + ".";
    }

}