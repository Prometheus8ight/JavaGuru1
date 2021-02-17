package instructor.lesson_5.loop;

import java.util.Random;

public class ForSum {

    public static void main(String[] args) {

        Random random = new Random();

        int[] foo = new int[10];

        // Generate random numbers
        for (int i = 0; i < foo.length; i++) {
            foo[i] = random.nextInt(11);
        }

        // Print array
        for (int i = 0; i < foo.length; i++) {
            System.out.print(foo[i] + " ");
        }

        // Compute sum
        int sum = 0;
        for (int i = 0; i < foo.length; i++) {
            sum += foo[i];
        }

        System.out.println();
        System.out.println("sum = " + sum);

    }
}
