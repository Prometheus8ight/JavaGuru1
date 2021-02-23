package students.arkadij.lesson_5.task_33;

import java.util.Random;

class Arrays {

    public int[] create(int length){
        return new int[length];
    }

    public void fillRandomly(int[] array){ // task 33
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(5);
        }
    }

    public void print(int[] array){ // task 34
        System.out.println(java.util.Arrays.toString(array));
    }

    public int findMax(int[] array){ // task 35
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int findMin(int[] array){ // task 37
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
