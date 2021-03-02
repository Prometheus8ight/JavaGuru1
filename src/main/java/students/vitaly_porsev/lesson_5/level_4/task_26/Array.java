package students.vitaly_porsev.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

class Array {

    int[] userArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        return makeArray(scanner.nextInt());
    }

    int[] makeArray(int arrayLength){
        int[] array = new int[arrayLength];
        fillArray(array);
        return array;
    }


    void fillArray(int[] array){
        Random random = new Random();
        for(int i = 0; i < array.length; i ++){
            array[i] = random.nextInt(1000);
        }
    }
}
