package students.lolita_polakova.lesson_3.level_7.task_30;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String productName) {
        this.name = productName;
    }
    double actualPrice() {
        double newPrice = this.regularPrice - (this.regularPrice*this.discount)/100;
        return newPrice;
    }

    public void printInformation() {
        System.out.println("Product: " + this.name);
        System.out.println("Regular price: " + this.regularPrice);
        System.out.println("% Discount: " + this.discount);
        System.out.println("Actual price: " + this.actualPrice());
    }
}

class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("Dress");
        product.regularPrice = 89.99;
        product.discount = 30;
        product.printInformation();
    }

}