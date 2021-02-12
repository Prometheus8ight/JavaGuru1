package students.rodion_afanasjev.lesson_4.level_6.task_17;

class Stock {

    String name;
    int actualPrice;
    int minPrice;
    int maxPrice;

    public Stock(String name, int price){
        this.name = name;
        this.actualPrice = price;
        this.minPrice = price;
        this.maxPrice = price;
    }

    public void updatePrice(int newPrice){
        this.actualPrice = newPrice;
        if (this.minPrice > newPrice) {
            minPrice = newPrice;
        }
        else if (this.maxPrice < newPrice) {
            this.maxPrice = newPrice;
        }
    }

    public void getPriceInformation(){
        System.out.println("Company: " + name + ", Current price: " + actualPrice
                + ", Min price: " + minPrice + ", Max price: " + maxPrice);
    }

}
