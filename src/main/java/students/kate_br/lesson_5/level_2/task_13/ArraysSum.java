package students.kate_br.lesson_5.level_2.task_13;

import java.util.Random;

class ArraysSum {

     public static void main(String[] args) {
         Random random = new Random();

         int[] num = new int[3];

         for (int i = 0; i < num.length; i++){
             num[i] = random.nextInt(4);
         }

         for (int i = 0; i < num.length; i++){
             System.out.print(num[i] + " ");
         }

         int sum = 0;
         for (int i = 0; i < num.length; i++){
             sum += num[i];
         }

         System.out.println();
         System.out.println("Sum = " + sum);
     }
}
