package students.darja_scavrovica.lesson_4.level_3.task_8;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {


        System.out.println("Enter 3 integers number = ");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 == number2 && number3 == number2&& number1 == number3  ) {
            System.out.println("All numbers are equal");}

        else if (number1 != number2 && number2!=number3&&number1 != number3 ) {
            System.out.println("All numbers are different");
        }

        else {System.out.println("Neither all are equal or different");}
    }
}
