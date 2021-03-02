package students.arkadij.lesson_5.task_29;
import java.util.Arrays;

class EvenNumbersFromArray {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0 ){
                System.out.println(numbers[i]);
            }
        }
        System.out.println("All numbers were: " + Arrays.toString(numbers));

    }

}
