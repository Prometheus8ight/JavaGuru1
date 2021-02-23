package students.bogdans_pavlovs.lesson_5.level_4.task_30;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */

import java.util.Random;

class ArraysTask30 {

    public static void main(String[] args) {

        Random getNumber = new Random();

        //создайте массив произвольной длины
        int[] numbers = new int[10];

        //заполните массив случайными числами
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = getNumber.nextInt();

        }

        //распечатайте на консоль все элементы массива
        System.out.print("Your array contains: ");

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + "; ");

        }

        //найдите все нечётные числа в массиве и выведети их на консоль
        System.out.println("");
        System.out.print("Array odd numbers are: ");

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0) {

                System.out.print(numbers[i] + "; ");

            }

        }



    }

}
