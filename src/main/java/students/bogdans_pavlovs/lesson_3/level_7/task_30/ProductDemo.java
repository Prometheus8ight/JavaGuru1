package students.bogdans_pavlovs.lesson_3.level_7.task_30;

class ProductDemo {

    public static void main(String[] args) {

        Product fridge = new Product("Beko Fridge");

        fridge.regularPrice = 380.99;
        fridge.discount = 0.25;

        fridge.actualPrice();
        fridge.printInformation();

    }
}
