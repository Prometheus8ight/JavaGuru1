package students.rodion_afanasjev.lesson_5.level_4.task_26;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class ArrayRand {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input array length: ");
        int input = scan.nextInt();
        int[] numbers = new int[input];

        for ( int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(20);
        }

        System.out.println(Arrays.toString(numbers));

    }

}
