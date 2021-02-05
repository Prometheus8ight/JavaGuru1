package students.rodion_afanasjev.lesson_3.level_7.task_30;

class Product {

    String name = "milk";
    double regularPrice;
    double discount;

    Product(double regularPrice, double discount){
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice(){
        return regularPrice * discount / 100;
    }

    void printInformation(){
        System.out.println(name + " " + regularPrice + " eur.");
        System.out.println("Discount " + discount + "%");
        System.out.println("Actual price of the " + name + " is " + (regularPrice - actualPrice()) + " eur.");

    }

}
