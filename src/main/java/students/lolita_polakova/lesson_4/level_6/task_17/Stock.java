package students.lolita_polakova.lesson_4.level_6.task_17;

class Stock {

    String name;
    int price;
    int minPrice;
    int maxPrice;

    Stock(String companyName, int currentPrice) {

        this.name = companyName;
        this.price = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        this.price = newPrice;

        if (minPrice > newPrice) {
            minPrice = newPrice;
        } else if (maxPrice < newPrice) {
            maxPrice = newPrice;
        }
    }

    public void getPriceInformation() {
        System.out.println("Company: " + name + ", Current price = " + price + ", Min Price = "
                + minPrice + ", Max Price = " + maxPrice);
    }
}

class StockDemo {

    public static void main(String[] args) {

        Stock stock = new Stock("Apricot", 10);
        stock.getPriceInformation();
        stock.updatePrice(15);
        stock.updatePrice(7);
        stock.updatePrice(14);
        stock.getPriceInformation();
    }
}
