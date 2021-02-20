package students.rodion_afanasjev.lesson_5.level_4.task_27;
import java.util.Arrays;
import java.util.Random;

class ArrayInput {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];

        for ( int i = 0; i < numbers.length; i++ ){
            numbers[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.stream(numbers).max().getAsInt());

    }
}
