package students.kate_br.lesson_5.level_2.task_14;

import students.vitaly_porsev.lesson_2.level_3.task_11.Average;

import java.util.Random;

class AverageArray {

     public static void main(String[] args) {
         Random random = new Random();

         int[] num = new int[3];

         for (int i = 0; i < num.length; i++){
             num[i] = random.nextInt(4);
         }

         for (int i = 0; i < num.length; i++){
             System.out.println(num[i]);
         }

         double sum = 0.0;
         for (int i = 0; i < num.length; i++){
             sum += num[i];
         }

         System.out.println();
         System.out.println("Average = " + (sum / 3));


     }
}
