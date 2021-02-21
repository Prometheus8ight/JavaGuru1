package students.alex_kalashnikov.lesson_4.level_6.task_17;

class Stock {

    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String stockName, int currentPrice) {
        this.name = stockName;
        this.currentPrice = currentPrice;
    }

    void updatePrice(int currentPrice) {
        this.currentPrice = currentPrice;
        if (currentPrice < minPrice) {
            minPrice = currentPrice;
        } else if (currentPrice > maxPrice) {
            maxPrice = currentPrice;
        }
    }

    String getPriceInformation() {
        return "Company = " + name + ", " + "Current price = " + currentPrice + ", " + "Max price = " + maxPrice + ", " + "Min price = " + minPrice + ".";
    }

}