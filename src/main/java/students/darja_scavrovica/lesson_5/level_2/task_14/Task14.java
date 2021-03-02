package students.darja_scavrovica.lesson_5.level_2.task_14;

import java.util.Random;

class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[3];
        int sum = 0;
        int average;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum:"+sum);
        average = (int) sum / arr.length;
        System.out.println("Average:"+average);
    }



    }

