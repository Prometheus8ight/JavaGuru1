package students.deniss_jankovskis.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_27 {

    public static void main(String[] args) {

        int[] foo = new int[10];
        Random random = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i < foo.length; i++) {
            foo[i] = random.nextInt(100);
        }

        int largestNumber = foo[0];
        for (int i = 0; i < foo.length; i++) {
            if(foo[i] > largestNumber)
                largestNumber = foo[i];
        }

        System.out.println("Random numbers: " + Arrays.toString(foo));
        System.out.println("The largest number is: " + largestNumber);





    }
}




