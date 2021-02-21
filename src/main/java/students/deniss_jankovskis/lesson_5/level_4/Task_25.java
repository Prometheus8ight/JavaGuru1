package students.deniss_jankovskis.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {


    public static void main(String[] args) {

        System.out.println("Please enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int num[] = new int[size];
        System.out.println("Please enter the arrays one by one: ");

        for(int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.println("Contents of the arrays are " + Arrays.toString(num));

    }

}

