package instructor.lesson_9;

import java.util.Arrays;

class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        Car car2 = car1;
        Car car3 = new Car("BMW");

        System.out.println("car1.hashCode() = " + car1.hashCode());
        System.out.println("car2.hashCode() = " + car2.hashCode());
        System.out.println("car3.hashCode() = " + car3.hashCode());

        if (car1.equals(car1)) {
            System.out.println("1.");
        }

        if (car1.equals(car2)) {
            System.out.println("2.");
        }

        if (car1.equals(car3)) {
            System.out.println("3.");
        }

        String[] x = {null};
        String[] y = {null};

        System.out.println(Arrays.equals(x, y));

    }
}
