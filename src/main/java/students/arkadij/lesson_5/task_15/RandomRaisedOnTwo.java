package students.arkadij.lesson_5.task_15;
import java.util.Random;
import java.util.Arrays;

class RandomRaisedOnTwo {

    public static void main(String[] args) {
        Random randomNum = new Random();
        int [] anyNumbers = new int[3];
        for (int i = 0; i < anyNumbers.length; i++){
            anyNumbers[i] = randomNum.nextInt(10);
        }
        System.out.println("Three random numbers are: " + Arrays.toString(anyNumbers));

        int raisedOnTwo = 2;
        for (int i = 0; i < anyNumbers.length; i++){
            anyNumbers[i] *= raisedOnTwo;
        }
        System.out.println("Three random numbers multiplication on two: " + Arrays.toString(anyNumbers));
    }

}
