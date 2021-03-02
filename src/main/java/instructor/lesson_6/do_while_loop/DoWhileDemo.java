package instructor.lesson_6.do_while_loop;

import java.util.concurrent.TimeUnit;

public class DoWhileDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Before Do While");

        int foo = 0;

        do {
            System.out.println("In Do While");
            System.out.println(System.currentTimeMillis());
            TimeUnit.SECONDS.sleep(2);
        } while (foo != 1);

        System.out.println("After Do While");

    }
}
