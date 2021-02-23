package students.arkadij.lesson_5.task_14;
import java.util.Arrays;

class AverageNumbers {

    public static void main(String[] args) {
        int[] numbers = {2,5,11};
        int average = 0;
        for (int i = 0; i < numbers.length; i++){
            average += numbers[i];
        }
        System.out.println(Arrays.toString(numbers) +
                " Average number is: " + average / numbers.length); // answer is [6]
    }

}
