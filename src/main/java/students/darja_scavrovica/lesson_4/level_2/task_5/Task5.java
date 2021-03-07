package students.darja_scavrovica.lesson_4.level_2.task_5;

import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {


        System.out.println("Напишите 2 целых числа = ");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("число " + number1 + " является больше");}

        else {System.out.println("число " + number2 + " является больше");}
    }
}
