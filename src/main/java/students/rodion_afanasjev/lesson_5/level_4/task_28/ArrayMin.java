package students.rodion_afanasjev.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class ArrayMin {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];
        for ( int i = 0; i< numbers.length; i++){
            numbers[i] = rand.nextInt(10);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.stream(numbers).min().getAsInt());

    }

}
