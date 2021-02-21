package students.arkadij.lesson_4.task_17;

class Stock {

    String companyNamed;
    int minPrice;
    int maxPrice;
    int currentPrice;

    Stock(String companyNamed, int currentPrice){
        this.companyNamed = companyNamed;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    public void updatePrice(int newPrice){
        currentPrice = newPrice;
        if (minPrice > newPrice){
            minPrice = newPrice;
        } else if (maxPrice < newPrice){
            maxPrice = newPrice;
        }
    }

    public String getPriceInformation(){
        return "The company: "+companyNamed+"\n The current price: "+currentPrice+"\n The min price: "+minPrice+
                "\n The max price: "+maxPrice;
    }

}
