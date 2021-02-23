package students.vitaly_porsev.lesson_5.level_4.task_30;

import java.util.Random;

class Array {

    void fillArray(int[] array){
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
    }

    void findNotEvenNum(int[] array){
        for(int num : array){
            if(num % 2 == 1){
                System.out.print(num + " ");
            }
        }
    }
}
