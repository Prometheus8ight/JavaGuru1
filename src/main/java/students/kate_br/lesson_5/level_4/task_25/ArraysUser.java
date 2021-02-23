package students.kate_br.lesson_5.level_4.task_25;


import java.util.Arrays;
import java.util.Scanner;

class ArraysUser {

     public static void main(String[] args) {

         System.out.println("Please input arrays length: ");
         Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();

         int[] num1 = new int[num];

         for (int i = 0; i < num1.length; i++){
             System.out.println("Please input numbers: ");
             num1[i] = scanner.nextInt();
         }

         System.out.println(Arrays.toString(num1));

     }
}
