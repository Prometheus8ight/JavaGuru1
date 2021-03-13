package students.lolita_polakova.lesson_5.level_2.task_13;

import java.util.Random;

class Array4 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[3];
        numbers[0] = random.nextInt(100);
        numbers[1] = random.nextInt(100);
        numbers[2] = random.nextInt(100);

        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[1]: " + numbers[1]);  //для наглядности :)
        System.out.println("numbers[2]: " + numbers[2]);

        int sum = numbers[0] + numbers[1] + numbers[2];
        System.out.println("Sum: " + sum);
    }
}