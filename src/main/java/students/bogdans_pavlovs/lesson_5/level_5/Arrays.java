package students.bogdans_pavlovs.lesson_5.level_5;

/*
Создайте класс Arrays.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.
 */

import java.util.Random;

class Arrays {

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {

        Random fillArray = new Random();

        for (int i = 0; i < array.length; i++){

            array[i] = fillArray.nextInt();
        }

    }

}
