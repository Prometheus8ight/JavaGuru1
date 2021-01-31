package students.bogdans_pavlovs.level_3.task_9;

import java.util.Scanner;

class task_9 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter number to multiply: ");
        int mathInput = scanner.nextInt();

        System.out.println(mathInput + (" x 1 = ") + mathInput);
        System.out.println(mathInput + (" x 2 = ") + mathInput * 2);
        System.out.println(mathInput + (" x 3 = ") + mathInput * 3);
        System.out.println(mathInput + (" x 4 = ") + mathInput * 4);
        System.out.println(mathInput + (" x 5 = ") + mathInput * 5);
        System.out.println(mathInput + (" x 6 = ") + mathInput * 6);
        System.out.println(mathInput + (" x 7 = ") + mathInput * 7);
        System.out.println(mathInput + (" x 8 = ") + mathInput * 8);
        System.out.println(mathInput + (" x 9 = ") + mathInput * 9);
        System.out.println(mathInput + (" x 10 = ") + mathInput * 10);

        //Expected Output :
        //8 x 1 = 8
        //8 x 2 = 16
        //8 x 3 = 24
        //...
        //8 x 10 = 80

    }
}
