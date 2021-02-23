package students.kate_br.lesson_5.level_4.task_30;

import java.util.Arrays;
import java.util.Random;

class ArrayOdd {

     public static void main(String[] args) {

         int[] num = new int[10];
         Random random = new Random();

         for(int i = 0; i < num.length; i++){
             num[i] = random.nextInt(11);
         }

         System.out.println(Arrays.toString(num));

         for(int i = 0; i < num.length; i++){

             if(num[i] % 2 != 0){
                 System.out.print("Odd number is: ");
                 System.out.println(num[i]);
             }
         }
     }
}
