package students.andrew_galashin.lesson_13.level_5;

import java.util.Arrays;

public class StringCalculator {
    int add(String numbers) {
        int x = 0;
        if (numbers.equals("") || numbers.isEmpty() || numbers.endsWith("\n")) {
            return x;
        } else {
            String[] number = numbers.replaceAll("[^0-9]", "").split("");
            System.out.println(Arrays.toString(number));

            for (String cleanNumber : number) {
                x += Integer.parseInt(cleanNumber);
            }
        }
        return x;
    }
}
