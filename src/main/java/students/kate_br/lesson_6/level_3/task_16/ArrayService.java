package students.kate_br.lesson_6.level_3.task_16;

 class ArrayService {

     void revert(int[] arr){

         for (int i = 0; i < arr.length / 2; i++){

             int temp = arr[i];

             arr[i] = arr[arr.length - 1 - i];
             arr[arr.length -1 - i] = temp;
         }


     }
}
