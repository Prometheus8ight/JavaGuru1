package students.alex_kalashnikov.lesson_3.level_7.task_30;

class ProductDemo {

    public static void main(String[] args) {

        Product product1 = new Product("Компьютер");
        product1.regularPrice = 752.54;
        product1.discount = 12.50;
        product1.actualPrice(product1.regularPrice, product1.discount);

    }

}
