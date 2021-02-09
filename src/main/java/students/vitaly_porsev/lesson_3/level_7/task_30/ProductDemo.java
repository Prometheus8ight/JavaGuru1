package students.vitaly_porsev.lesson_3.level_7.task_30;

class ProductDemo {
    public static void main(String[] args) {
        Product car = new Product("Peugeot");
        car.setRegulaPrice(1250);
        car.setDiscount(15);
        car.printInformation();
    }
}
