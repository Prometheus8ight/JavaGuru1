package instructor.lesson_14.lambda;

import java.util.function.Consumer;

public class ConsumerLambdaDemo {

    public static void main(String[] args) {

        Consumer<String> print = str -> System.out.println(str);

        print.accept("Hello World!");

    }
}
