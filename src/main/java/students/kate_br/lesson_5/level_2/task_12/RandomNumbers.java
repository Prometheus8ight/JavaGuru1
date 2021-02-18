package students.kate_br.lesson_5.level_2.task_12;

import java.util.Random;

class RandomNumbers {

     public static void main(String[] args) {

         Random random = new Random();

         int[] num = new int[3];


         for(int i = 0; i < num.length; i++){
            num[i] = random.nextInt(4);
         }

         for(int i = 0; i < num.length; i++){
             System.out.println(num[i]);
         }
     }
}
