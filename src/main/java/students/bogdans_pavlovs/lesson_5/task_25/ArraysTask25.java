package students.bogdans_pavlovs.lesson_5.task_25;

import java.util.Scanner;

class ArraysTask25 {

    public static void main(String[] args) {

        //запросите у пользователя с консоли длину массива
        Scanner getLength = new Scanner(System.in);
        Scanner getNumber = new Scanner(System.in);

        System.out.print("Enter array length: ");

        //создайте массив указанной пользователем длины
        int[] numbers = new int[getLength.nextInt()];

        //заполните массив числами полученными от пользователя
        for (int i = 0; i < numbers.length; i++){

            System.out.print("Array index " + i + " = ");
            numbers[i] = getNumber.nextInt();

        }

        //распечатайте на консоль все элементы массива
        System.out.print("Your array contains: ");

        for (int i = 0; i <numbers.length; i++){

            System.out.print(numbers[i] + "; ");

        }

    }

}
