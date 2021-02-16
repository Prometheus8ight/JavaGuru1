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


    String getPriceInformation() {
        return "Company = " + name + ", " + "Current price = " + currentPrice + ", " + "Max price = " + maxPrice + ", " + "Min price = " + minPrice + ".";
    }

    int updatePrice() {                           // метод для изменения current price
        return currentPrice;
    }

    int setMaxPrice(int currentPrice) {           // метод для изменения maxPrice
        if (currentPrice > maxPrice) {
            maxPrice = currentPrice;
            return maxPrice;}
        else {
            return maxPrice;
        }
    }

    int setMinPrice(int currentPrice) {          // метод для изменения minPrice
        if (currentPrice < minPrice) {
            minPrice = currentPrice;
            return minPrice;}
        else { return minPrice;}
    }

}
