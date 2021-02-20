package students.rodion_afanasjev.lesson_5.level_4.task_30;
import java.util.Arrays;
import java.util.Random;

class ArrayOdd {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
    }

}
