package students.kate_br.lesson_5.level_4.task_27;


import java.util.Arrays;
import java.util.Random;

class ArrayMax {

     public static void main(String[] args) {
         int[] num = new int[10];
         Random random = new Random();

         for(int i = 0; i < num.length; i++){
             num[i] = random.nextInt(11);
         }

         int max = num[0];
         for (int i = 0; i < num.length; i++){
             if (num[i] > max){
                 max = num[i];
             }

         }

         System.out.println(Arrays.toString(num));
         System.out.println("Max num is: " + max);

     }
}
