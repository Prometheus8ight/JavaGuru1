package students.kate_br.lesson_5.level_6.task_36;

 class Arrays {

     public int[] create(int length) {
         return new int[length];
     }

     public int findMax(int[] array) {
         int max = array.length;

         for (int num : array) {
             if (num > max) {
                 max = num;
             }

         }
       return max;


     }
 }
