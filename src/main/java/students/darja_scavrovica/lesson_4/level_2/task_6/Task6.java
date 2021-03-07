package students.darja_scavrovica.lesson_4.level_2.task_6;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {


        System.out.println("Напишите 2 целых числа = ");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("число " + number2 + " является меньше");}

        else {System.out.println("число " + number1 + " является меньше");}
    }
}
