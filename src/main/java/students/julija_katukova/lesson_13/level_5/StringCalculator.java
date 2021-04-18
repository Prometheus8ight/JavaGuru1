package students.julija_katukova.lesson_13.level_5;

import java.util.Arrays;

class StringCalculator {

    int add(String numbers) {
        int sum = 0;
        if (numbers.equals("") || numbers.isEmpty() || numbers.endsWith("\n")) {
            return sum;
        } else {
            //String cleanNumbers = numbers.replaceAll("[^0-9]", " ");
            String[] cleanNumbers = numbers.replaceAll("[^0-9]", "").split("");
            System.out.println(Arrays.toString(cleanNumbers));

            for (String cleanNumber : cleanNumbers) {
                sum += Integer.parseInt(cleanNumber);
            }
        }
        return sum;
    }
}
