package students.pavels_steinbors.lesson_3.level_7.task_30;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String itemName) {
        this.name = itemName;
    }

    double actualPrice() {
        return regularPrice - regularPrice * discount / 100.00;
    }

    void printInformation() {

        System.out.println("Product: " + this.name);
        System.out.println("Old price: " + regularPrice);

        System.out.println("Discount %: " + discount);
        System.out.println("New price: " + actualPrice());
    }
}
