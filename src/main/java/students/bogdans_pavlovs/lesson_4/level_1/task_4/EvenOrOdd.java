package students.bogdans_pavlovs.lesson_4.level_1.task_4;

import java.util.Scanner;

class EvenOrOdd {

    public static void main(String[] args) {

        Scanner enterNumber = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int yourNumber = enterNumber.nextInt();

        if (yourNumber != 0) {

            if (yourNumber%2 != 0){

                System.out.println(yourNumber + " is an odd number");

            }else {

                System.out.println(yourNumber + " is an even number");

            }

        }else {

            System.out.println(yourNumber + " is neither odd, nor even");
        }

    }

}
