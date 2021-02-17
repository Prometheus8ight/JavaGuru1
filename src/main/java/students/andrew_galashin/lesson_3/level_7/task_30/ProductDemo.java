package students.andrew_galashin.lesson_3.level_7.task_30;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Coca-Cola");
        product.regularPrice = 1.0;
        product.discount = 5;
        product.actualPrice();
        product.printInformation();
    }
}
