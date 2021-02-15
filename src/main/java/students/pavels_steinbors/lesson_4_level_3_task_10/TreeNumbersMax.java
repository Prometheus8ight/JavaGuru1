package students.pavels_steinbors.lesson_4_level_3_task_10;

import java.util.Scanner;

class TreeNumbersMax {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int max;   // chislo kotoroe budet maximaljnim

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        a = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        b = scanner.nextInt();
        System.out.println("Введите третье целое число: ");
        c = scanner.nextInt();

        max = a;            // po umolcaniu a - maximaljnoe chislo
        if (b > a) {
            max = b;        // esle chislo b budet bolse chisla a, b stanovitsa maximaljnim
        }
        if (c > b) {
            max = c;        // s chislom c toze samoe
        }

        System.out.println("Наибольшее из трех чисел: " + max);

    }

}


