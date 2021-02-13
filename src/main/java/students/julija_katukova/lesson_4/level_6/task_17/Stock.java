package students.julija_katukova.lesson_4.level_6.task_17;

class Stock {
    String companyName; //ввели характеристики
    int stockInitialPrice;
    int currentPrice;
    int maxPrice;
    int minPrice;

    public int updatePrice(int stockCurrentPrice){  //добавили метод updatePrice
        if (stockCurrentPrice > maxPrice) {  // если новая цена больше максимальной, она становится максимальной
           return maxPrice = stockCurrentPrice;
        }
        if (stockCurrentPrice < minPrice) {             // если новая цена меньше минимальной, она становится минимальной
            return minPrice = stockCurrentPrice;}
        return currentPrice = stockCurrentPrice;        // изменяется текущая стоймоть
    }

    public String getPriceInformation() {              //добавили метод getPriceInformation
        String company = "Company = \"" + companyName + "\", ";
        String current = "Current Price = " + currentPrice + ", ";
        String min = "Min Price = " + minPrice + ", ";
        String max = "Max Price = " + maxPrice + ", ";
        return company + current + min + max;
    }

    Stock(String stockCompanyName, int stockInitialPrice) {  //добавили конструктор, чтобы Имя компании и начальную стоимость можно было задавать в момент создания акции
        this.companyName = stockCompanyName;
        this.stockInitialPrice = stockInitialPrice;
        currentPrice = stockInitialPrice;
        maxPrice = stockInitialPrice;                   // в начале минимальная и максимальная цена равны изначальной цене
        minPrice = stockInitialPrice;
    }

    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

    }
}
