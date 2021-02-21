package students.vitaly_porsev.lesson_5.level_2.task_11;

import java.util.Arrays;
import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        System.out.println("Введите три числа: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
