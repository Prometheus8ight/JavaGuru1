package instructor.lesson_14.functionals;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        EvenPredicate p1 = new EvenPredicate();
        System.out.println("p1.test(3) = " + p1.test(3));
        System.out.println("p1.test(4) = " + p1.test(4));

        EmptyStringPredicate p2 = new EmptyStringPredicate();
        System.out.println("p2.test(\"12345\") = " + p2.test("12345"));
        System.out.println("p2.test(\"\") = " + p2.test(""));

    }
}

class EvenPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer x) {
        return x % 2 == 0;
    }
}

class EmptyStringPredicate implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return s.isEmpty();
    }
}
