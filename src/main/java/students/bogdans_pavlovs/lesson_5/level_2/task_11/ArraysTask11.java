package students.bogdans_pavlovs.lesson_5.level_2.task_11;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива числом, запрошенным у пользователя,
 - выведите значение каждой ячейки на консоль.

 */

import java.util.Scanner;

class ArraysTask11 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Scanner prompter = new Scanner(System.in);

        System.out.println("Enter three integers: ");

        numbers[0] = prompter.nextInt();
        numbers[1] = prompter.nextInt();
        numbers[2] = prompter.nextInt();

        System.out.print("You chose: " + numbers[0] + ", " + numbers[1] + ", " + numbers [2]);


    }
}
