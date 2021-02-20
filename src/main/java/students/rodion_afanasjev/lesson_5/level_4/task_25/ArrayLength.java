package students.rodion_afanasjev.lesson_5.level_4.task_25;
import java.util.Arrays;
import java.util.Scanner;

class ArrayLength {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input array length: ");
        int input = scan.nextInt();
        int[] numbers = new int[input];

        for ( int i = 0; i < numbers.length; i++){
            numbers[i] = input;
        }

        System.out.println(Arrays.toString(numbers));

    }

}
