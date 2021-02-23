package students.julija_katukova.lesson_5.level_5;

import java.util.Random;

class Arrays {
    public static int[] create(int length) {
        int[] numbers = new int[length];
        return numbers;
    }

    public static void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }
}
