package instructor.lesson_6.while_loop;

import java.util.concurrent.TimeUnit;

public class WhileDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Before While Loop!");

        int foo = 0;

        while (foo != 1) {
            System.out.println("Inside While!");
            System.out.println(System.currentTimeMillis());
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println("After While Loop!");

    }
}
