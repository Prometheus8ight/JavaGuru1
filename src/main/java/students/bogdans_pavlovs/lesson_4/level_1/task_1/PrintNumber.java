package students.bogdans_pavlovs.lesson_4.level_1.task_1;


import java.util.Scanner;

class PrintNumber {

    public static void main(String[] args) {

        Scanner askNumber = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int yourNumber = askNumber.nextInt();

        if (yourNumber < 0){

            System.out.println(yourNumber + " is a negative number :(");
        } else if (yourNumber > 0) {

            System.out.println(yourNumber + " is a positive number :)");
        } else

            System.out.println("Huh.. Picked a " + yourNumber + ", buddy?");
    }
}
