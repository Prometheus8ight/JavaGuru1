package students.darja_scavrovica.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task26 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];

        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.print(Arrays.toString(a));
    }
}