package students.darja_scavrovica.lesson_4.level_3.task_10;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {


        System.out.println("Напишите 3 целых числа = ");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 > number2&& number1 > number3) {
            System.out.println("число " + number1 + " является больше");}
         else if (number2 > number1&& number2 > number3)
         {System.out.println("число " + number2 + " является больше"); }

        else {System.out.println("число " + number3 + " является больше");}
    }
}
