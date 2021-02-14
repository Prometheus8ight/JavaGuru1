package students.pavels_steinbors.lesson_3.level_7.task_30;

class ProductDemo {

    public static void main(String[] args) {

        Product bread = new Product("Bread");
        bread.regularPrice = 3.00;
        bread.discount = 15.00;
        bread.actualPrice();
        bread.printInformation();
    }
}
