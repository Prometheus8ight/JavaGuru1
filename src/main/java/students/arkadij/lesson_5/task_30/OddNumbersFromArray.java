package students.arkadij.lesson_5.task_30;
import java.util.Arrays;

class OddNumbersFromArray {

    public static void main(String[] args) {
        System.out.println("|| ODD NUMBERS GAME ||");

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                System.out.println("Odd number: " + numbers[i]);
            }
        }
    }

}
