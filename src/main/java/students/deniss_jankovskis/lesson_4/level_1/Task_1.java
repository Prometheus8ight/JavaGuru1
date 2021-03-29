package students.deniss_jankovskis.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number");


        } else {
            System.out.println(number + " is a negative number");
        }

    }

}
