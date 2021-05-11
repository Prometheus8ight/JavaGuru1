package students.andrew_galashin.lesson_13.level_5;

import java.util.Arrays;

class StringCalculator {
    int add(String numbers) {
        int sum = 0;
        if (numbers.equals("") || numbers.isEmpty() || numbers.endsWith("\n")) {
            return sum;
        } else {
            String[] number = numbers.replaceAll("[^0-9]", "").split("");
            System.out.println(Arrays.toString(number));
            for (String cleanNumber : number) {
                sum += Integer.parseInt(cleanNumber);
            }
        }
        return sum;
    }
}
