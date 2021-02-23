package students.bogdans_pavlovs.lesson_5.level_4.task_27;

import java.util.Random;

class ArraysTask27 {

    public static void main(String[] args) {

        Random getNumber = new Random();

        //создайте массив произвольной длины
        int[] numbers = new int[10];
        int max = numbers[0];

        //заполните массив случайными числами
        for (int i = 0; i < numbers.length; i++){

            numbers[i] = getNumber.nextInt();

        }

        //распечатайте на консоль все элементы массива
        System.out.print("Your array contains: ");

        for (int i = 0; i <numbers.length; i++){

            System.out.print(numbers[i] + "; ");

            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println("");
        //найдите наибольшее число в массиве и выведети его на консоль
        System.out.print("Highest array value is: " + max);

    }

}
