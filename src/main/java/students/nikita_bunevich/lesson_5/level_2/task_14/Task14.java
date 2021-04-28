package students.nikita_bunevich.lesson_5.level_2.task_14;

import java.util.Random;

class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[3];
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt();
            sum = sum + number[i];
        }
        int average = sum / number.length;
        System.out.println("Среднее значение:" + average);
    }
}
