package students.kate_br.lesson_5.level_2.task_10;

import java.util.Arrays;
import java.util.Random;

class ArrayOf3Numbers {

     public static void main(String[] args) {
         int[] numbers = new int[3];
         Random random = new Random();

         for (int i = 0; i < numbers.length; i++){
             numbers[i] = random.nextInt(4);
         }

         System.out.println(Arrays.toString(numbers));

     }
}
