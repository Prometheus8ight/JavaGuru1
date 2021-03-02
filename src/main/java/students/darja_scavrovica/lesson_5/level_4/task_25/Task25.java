package students.darja_scavrovica.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in array");
          for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(a));
    }

}

