package instructor.lesson_14.functionals;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        TextSupplier s1 = new TextSupplier();
        System.out.println("s1.get() = " + s1.get());

    }
}

class TextSupplier implements Supplier<String> {

    @Override
    public String get() {
        return "Hello";
    }
}
