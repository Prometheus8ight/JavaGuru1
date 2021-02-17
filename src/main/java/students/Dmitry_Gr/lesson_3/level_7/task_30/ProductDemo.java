package students.Dmitry_Gr.lesson_3.level_7.task_30;

class ProductDemo {

    public static void main(String[] args) {

        Product car = new Product("Mersedes-Benz");

        car.regularPrice = 120000;
        car.discount = 0.05;

        car.actualPrice();
        car.printInformation();

    }
}

