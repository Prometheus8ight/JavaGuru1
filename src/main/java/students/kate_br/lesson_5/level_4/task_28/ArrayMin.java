package students.kate_br.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class ArrayMin {

     public static void main(String[] args) {

         int[] num = new int[10];
         Random random = new Random();

         for(int i = 0; i < 10; i++){
             num[i] = random.nextInt(11);
         }

         System.out.println(Arrays.toString(num));
         System.out.print("Min number is: ");
         System.out.println(Arrays.stream(num).min().getAsInt());
     }
}
