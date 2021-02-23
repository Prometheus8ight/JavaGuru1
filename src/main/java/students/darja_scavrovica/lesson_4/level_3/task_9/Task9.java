package students.darja_scavrovica.lesson_4.level_3.task_9;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {


        System.out.println("Enter 3 integers number = ");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 > number2 && number2 > number3 ) {
            System.out.println("increasing");}

        else if (number1 < number2 && number2<number3) {
            System.out.println("decreasing");
        }

        else {System.out.println("Neither increasing or decreasing order");}
    }
}
