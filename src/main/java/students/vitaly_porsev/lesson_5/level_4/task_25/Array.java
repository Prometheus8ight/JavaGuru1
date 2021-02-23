package students.vitaly_porsev.lesson_5.level_4.task_25;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите " + array.length + " чисел: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
    }

}
