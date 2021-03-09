package students.lolita_polakova.lesson_4.level_2.task_5;

import java.util.Scanner;

class MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer number: ");
        int a = scanner.nextInt();
        System.out.print("Please enter second integer number: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
