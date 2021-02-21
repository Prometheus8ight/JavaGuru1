package students.vitaly_porsev.lesson_5.level_2.task_13;

import java.util.Random;

class Array {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        int sum = 0;

        for(int arr : array){
            sum += arr;
        }

        System.out.println(sum);
    }
}
