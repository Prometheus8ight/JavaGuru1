package students.bogdans_pavlovs.lesson_3.level_2.task_9;

import java.util.Scanner;

class YourName {

    public static void main(String[] args) {

        Scanner getName = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String yourName = getName.nextLine();

        System.out.println("Hello " + yourName + "!");

    }
}
