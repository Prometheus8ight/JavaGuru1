package students.bogdans_pavlovs.lesson_5.level_4.task_28;

import java.util.Random;

class ArraysTask28 {

    public static void main(String[] args) {

        Random getNumber = new Random();

        //создайте массив произвольной длины
        int[] numbers = new int[10];
        int min = numbers[0];

        //заполните массив случайными числами
        for (int i = 0; i < numbers.length; i++){

            numbers[i] = getNumber.nextInt();

        }

        //распечатайте на консоль все элементы массива
        System.out.print("Your array contains: ");

        for (int i = 0; i <numbers.length; i++){

            System.out.print(numbers[i] + "; ");

            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        System.out.println("");
        //найдите наименьшее число в массиве и выведети его на консоль
        System.out.print("Lowest array value is: " + min);

    }

}
