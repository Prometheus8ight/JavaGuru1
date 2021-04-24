package students.rodion_afanasjev.lesson_13.level_5.task_26;

import java.util.Arrays;
import java.util.stream.Stream;

class StringCalculator {

    public static int add(String numbers) {
        if (numbers.isEmpty() || numbers.endsWith("\n"))
            return 0;
        try (Stream<String> arr = Arrays.stream(numbers.replaceAll("[^0-9]","").split(""))) {
            return arr.mapToInt(Integer::parseInt).sum();
        }
    }

}

