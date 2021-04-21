package instructor.lesson_14.lambda;

import java.util.function.Supplier;

public class SupplierLambdaDemo {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello World";
        System.out.println("supplier.get() = " + supplier.get());

    }
}
