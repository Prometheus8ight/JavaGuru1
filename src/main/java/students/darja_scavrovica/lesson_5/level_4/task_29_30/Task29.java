package students.darja_scavrovica.lesson_5.level_4.task_29_30;

import java.util.Arrays;
import java.util.Random;

class Task29 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[8];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        System.out.print("Even numbers : ");

        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0) {
                System.out.print(a[i]+",");
            }

        }
        System.out.println("");
        System.out.print("Odd numbers : ");

        for (int i = 0; i < a.length; i++){
            if(a[i] % 2!= 0) {
                System.out.print(a[i]+",");
            }

        }

    }
}