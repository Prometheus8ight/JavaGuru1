package students.julija_katukova.lesson_3.level_7.task_30;

class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Apples");
        product1.regularPrice = 5.00;
        product1.discount = 10.00;
        product1.actualPrice();
        product1.printInformation();

    }
}
