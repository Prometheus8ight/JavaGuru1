package students.bogdans_pavlovs.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

class ArraysTask26 {

    public static void main(String[] args) {

        //запросите у пользователя с консоли длину массива
        Scanner getLength = new Scanner(System.in);
        Random getNumber = new Random();

        System.out.print("Enter array length: ");

        //создайте массив указанной пользователем длины
        int[] numbers = new int[getLength.nextInt()];

        //заполните массив случайными числами
        for (int i = 0; i < numbers.length; i++){

            numbers[i] = getNumber.nextInt();

        }

        //распечатайте на консоль все элементы массива
        System.out.print("Your array contains: ");

        for (int i = 0; i <numbers.length; i++){

            System.out.print(numbers[i] + "; ");

        }

    }

}
