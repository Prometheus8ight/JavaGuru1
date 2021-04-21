package instructor.lesson_14.lambda;

import java.util.function.Function;

public class FunctionLambdaDemo {

    public static void main(String[] args) {

        /*
        Function<Integer, Integer> f1 = new Function<>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
         */

        Function<Integer, Integer> f1 = x -> x * x;
        Function<String, Integer> f2 = s -> Integer.parseInt(s);


        System.out.println("f1.apply(3) = " + f1.apply(3));

    }
}
