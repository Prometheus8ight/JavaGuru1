package students.andrejs_kuramsins.lesson_2.level_0.task_0.lesson_4.task_7;

import java.util.Scanner;

class Task7 {

    static void main(String[] args) {

        System.out.println("Please Enter your first number : ");
        Scanner num1 = new Scanner(System.in);
        int first = num1.nextInt();
        System.out.println("Please Enter your second number : ");
        Scanner num2 = new Scanner(System.in);
        int second = num2.nextInt();

        if (first == second)
            System.out.println("Numbers are equals");
        else
            System.out.println("Numbers are different");


    }


}
