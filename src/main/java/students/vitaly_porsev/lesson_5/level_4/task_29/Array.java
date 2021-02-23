package students.vitaly_porsev.lesson_5.level_4.task_29;

import java.util.Random;

class Array {

    void fillArray(int[] array){
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
    }

    void findEvenNum(int[] array){
        for(int num : array){
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
        }
    }

}
