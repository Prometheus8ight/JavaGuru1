package students.andrejs_kuramsins.lesson_2.level_0.task_0.lesson_4.task_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter your number : ");

        int number = scanner.nextInt();
        if (number >0) {
        System.out.println("True");}
        else {
            System.out.println("False");
        }


    }

}
