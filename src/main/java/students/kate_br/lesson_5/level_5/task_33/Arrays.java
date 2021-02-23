package students.kate_br.lesson_5.level_5.task_33;

import java.util.Random;

class Arrays {
    

    public void fillRandomly(int[] array){
         Random random = new Random();

         for (int i = 0; i < array.length; i++){
             array[i] = random.nextInt(100);
         }
     }
}
