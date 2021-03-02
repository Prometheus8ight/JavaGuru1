package students.darja_scavrovica.lesson_5.level_2.task_11;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLength2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        System.out.println("Enter the array element");

        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
            System.out.print(Arrays.toString(a));
        }

    }
