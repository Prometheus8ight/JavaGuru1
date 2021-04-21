package instructor.lesson_14.lambda;

import java.util.function.Predicate;

public class PredicateLambdaDemo {

    public static void main(String[] args) {

        Predicate<Integer> isEven = integer -> integer % 2 == 0;

        System.out.println("isEven.test(3) = " + isEven.test(3));

    }
}
