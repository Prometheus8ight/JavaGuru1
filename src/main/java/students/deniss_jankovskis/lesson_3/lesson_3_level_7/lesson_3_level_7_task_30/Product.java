package students.deniss_jankovskis.lesson_3.lesson_3_level_7.lesson_3_level_7_task_30;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name, double price, double discount) {
        this.name = name;
        this.regularPrice = price;
        this.discount = discount;

    }

    double actualPrice() {
        return regularPrice + regularPrice / discount;

    }

    void printInformation() {
        System.out.println("The price of meat is " + actualPrice() + " EUR ");
    }


}
