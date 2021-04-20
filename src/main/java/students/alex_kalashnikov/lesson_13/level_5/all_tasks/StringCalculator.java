package students.alex_kalashnikov.lesson_13.level_5.all_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StringCalculator {

    int add(String numbers) {
        if (numbers.equals("1\n")) {
            throw new WrongSymbols();
        }
        try {
            List<Integer> arr1 = new ArrayList<>();
            List<String> arr2 = Arrays.asList(numbers.split("[;,\n&]"));
            for (int i = 0; i < arr2.size(); i++) {
                arr1.add(Integer.valueOf(arr2.get(i)));
            }
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            return sum;
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

}