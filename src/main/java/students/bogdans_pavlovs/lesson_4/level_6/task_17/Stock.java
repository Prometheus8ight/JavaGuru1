package students.bogdans_pavlovs.lesson_4.level_6.task_17;

class Stock {

    String stockName; //Имя компании
    int currentPrice; //Текущая стоимость
    int minPrice;     //Минимальная стоимость
    int maxPrice;     //Максимальная стоимость

    //Имя компании и начальную стоимость необходимо задавать в момент создания акции
    Stock(String stockName, int currentPrice) {

        this.stockName = stockName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;

    }


    //Обновить текущую стоимость акции
    //Текущая, минимальная и максимальная стоимость должны меняться только через метод updatePrice()

    public void updatePrice(int newPrice){

        currentPrice = newPrice;

        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        }

    }



    //Получить информацию об акции
    public void getPriceInformation(){

        System.out.println
                ("Name: " + stockName + " Current Price: " + currentPrice + " Min Price: " + minPrice + " Max Price: " + maxPrice);

    }

}


/*
Необходимо реализовать класс Stock ("акция") таким образом,
чтобы была возможность узнать текущую цену акции,
а также ее максимальную и минимальную стоимость
за период существования.

Имя компании и начальную стоимость необходимо
задавать в момент создания акции.


Написать тестовые сценарии для класса Stock в классе StockTest.


10 -> 12 -> 5 -> 7 -> 99 -> 77

Test case max:

Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27


Пример работы с классом Stock:

Stock google = new Stock("GOOG", 10);
String priceInformation = google.getPriceInformation();
System.out.println(priceInformation);
​
google.updatePrice(15);
google.updatePrice(7);
google.updatePrice(14);
​
priceInformation = google.getPriceInformation();
System.out.println(priceInformation);

После выполнения кода вывод в консоли должет быть следующим:
Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10
Company = "GOOG", Current Price = 14, Min Price = 7, Max Price = 15
 */