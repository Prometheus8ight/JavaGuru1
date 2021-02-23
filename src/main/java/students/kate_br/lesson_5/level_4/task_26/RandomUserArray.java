package students.kate_br.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class RandomUserArray {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter the array length: ");
         int num = scanner.nextInt();

         int[] num1 = new int[num];

         Random random = new Random();

         for (int i = 0; i < num1.length; i++){
             num1[i] = random.nextInt(100);
         }

         System.out.println(Arrays.toString(num1));
     }
}
