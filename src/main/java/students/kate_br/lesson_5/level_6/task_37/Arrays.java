package students.kate_br.lesson_5.level_6.task_37;

 class Arrays {

     public int findMin(int[] array){
         int min = array[0];

         for(int num : array){
             if (num < min){
                 min = num;
             }
         }
         return min;
     }

 }
