package students.kate_br.lesson_5.level_2.task_15;

import java.util.Arrays;
import java.util.Random;

class ArraysIncrease {

     public static void main(String[] args) {
         Random random = new Random();

         int[] num = new int[3];
          for (int i = 0; i < num.length; i++){
              num[i] = random.nextInt(4);
          }
         System.out.println(Arrays.toString(num));

          int increase = 2;
          for (int i = 0; i < num.length; i++){
              num[i] += increase;
          }

         System.out.println(Arrays.toString(num));
     }
}
