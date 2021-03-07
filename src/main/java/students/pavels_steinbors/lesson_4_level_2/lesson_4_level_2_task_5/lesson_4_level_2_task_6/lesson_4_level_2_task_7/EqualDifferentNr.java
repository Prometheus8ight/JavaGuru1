package students.pavels_steinbors.lesson_4_level_2.lesson_4_level_2_task_5.lesson_4_level_2_task_6.lesson_4_level_2_task_7;

import java.util.Scanner;

class EqualDifferentNr {

    public static void main(String[] args) {

        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = scanner.nextInt();
        System.out.println("Enter second number: ");
        b = scanner.nextInt();


        if (a == b) {
            System.out.println("Numbers are equals");
        }
        else {
            System.out.println("Numbers are different");
        }


}

}
