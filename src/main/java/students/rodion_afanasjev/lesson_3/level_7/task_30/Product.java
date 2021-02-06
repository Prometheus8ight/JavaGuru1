package students.rodion_afanasjev.lesson_3.level_7.task_30;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name,double price, double discount){
        this.name = name;
        this.regularPrice = price;
        this.discount = discount;
    }

    double actualPrice(){
        return regularPrice - regularPrice * discount / 100;
    }

    void printInformation(){
        System.out.println("Price of the " + name + " is " + actualPrice() + " eur.");

    }



}
