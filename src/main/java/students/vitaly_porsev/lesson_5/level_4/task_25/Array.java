package students.vitaly_porsev.lesson_5.level_4.task_25;

import java.util.Scanner;

class Array {

   int[] makeArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        fillArray(array, arrayLength);
       return array;
   }

    void fillArray(int[] array, int arrayLength){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите " + arrayLength + " чисел: ");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
    }

}
