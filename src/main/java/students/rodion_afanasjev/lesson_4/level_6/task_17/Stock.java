package students.rodion_afanasjev.lesson_4.level_6.task_17;

class Stock {

    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String name, int currentPrice){
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice){
        currentPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        else if (newPrice < minPrice) {
            minPrice = newPrice;
        }

    }

    public String getPriceInformation(){
        return "Company: " + name + ", Current price: " + currentPrice
                + ", Min price: " + minPrice + ", Max price: " + maxPrice;
    }

}
