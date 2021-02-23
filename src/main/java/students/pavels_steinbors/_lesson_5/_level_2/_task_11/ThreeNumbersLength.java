package students.pavels_steinbors._lesson_5._level_2._task_11;

import java.util.Arrays;
import java.util.Scanner;

class ThreeNumbersLength {

    public static void main(String[] args) {

        int[] number = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number is: ");
        int one = scanner.nextInt();

        System.out.print("Second number is: ");
        int two = scanner.nextInt();

        System.out.print("Third number is: ");
        int three = scanner.nextInt();

        number[0] = one;
        number[1] = two;
        number[2] = three;

        System.out.print("Numbers: " + Arrays.toString(number) );
    }
}
