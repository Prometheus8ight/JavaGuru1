package students.andrejs_kuramsins.lesson_2.level_0.task_0.lesson_4.task_2;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = scanner.nextInt();
        if (number >0) {
            System.out.println("True");
        }else if (number <0) {
            System.out.println("False");
        } else  {
            System.out.println("Wat do you expect ? its zero");
        }

    }
}
