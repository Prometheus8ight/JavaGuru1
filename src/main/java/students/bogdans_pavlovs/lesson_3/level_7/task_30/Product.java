package students.bogdans_pavlovs.lesson_3.level_7.task_30;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name){
        this.name = name;
    }

    double actualPrice(){

        double result = regularPrice - regularPrice * discount;
        return result;
    }

    void printInformation (){

        System.out.println("Product Name: " + name);
        System.out.println("Regular Price: " + regularPrice);
        System.out.println("Discount: " + discount * 100 + "%");
        System.out.println("Actual Price: " + actualPrice());

    }


}
// Методы:
//1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
//Вывод информации о продукте в консоль (void printInformation())1P
//2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".