package instructor.lesson_14.functionals;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        PrintingConsumer c1 = new PrintingConsumer();
        c1.accept("Ja ne biolog");

        NoopConsumer c2 = new NoopConsumer();
        c2.accept(3742);

    }
}

class PrintingConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("The string: '" + s + "'");
    }
}

class NoopConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        // noop
    }
}
