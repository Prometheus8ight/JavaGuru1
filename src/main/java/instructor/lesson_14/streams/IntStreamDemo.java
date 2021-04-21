package instructor.lesson_14.streams;

import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args) {

        System.out.println(
                IntStream.rangeClosed(0, 100)
                        .filter(value -> value % 15 == 0)
                        .peek(System.out::println)
                        .summaryStatistics()
        );

    }
}
