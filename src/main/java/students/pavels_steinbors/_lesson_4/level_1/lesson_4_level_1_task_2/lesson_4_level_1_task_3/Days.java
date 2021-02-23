package students.pavels_steinbors._lesson_4.level_1.lesson_4_level_1_task_2.lesson_4_level_1_task_3;

import java.util.Scanner;

class Days {

    public static void main(String[] args) {

        Scanner day = new Scanner(System.in);
        System.out.println("Enter a number from 1-7: ");

        int number = day.nextInt();

        if (number == 1) {
            System.out.println("Monday");
        }

        else if (number == 2) {
            System.out.println("Tuesday");
        }
        else if (number == 3) {
            System.out.println("Wednesday");
        }
        else if (number == 4) {
            System.out.println("Thursday");
        }
        else if (number == 5) {
            System.out.println("Friday");
        }
        else if (number == 6) {
            System.out.println("Saturday");
        }
        else if (number == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Please, enter a number only from 1-7");
        }

    }


}
