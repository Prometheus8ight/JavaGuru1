package students.arkadij.lesson_2.level_5;

public class Task_15 {
    public static void main(String[] args) {
        System.out.println("Let's play a little. ");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("How old are you? ");
        int howOld = scanner.nextInt();

        System.out.println("Okay, now try to guess how old I am?");
        int oldIam = scanner.nextInt();

        System.out.print("Your age is: " + howOld + " || ");
        System.out.print(" You think my age is like that: " + oldIam + " || ");

        if (oldIam == (30)) {
            System.out.println(" You're right sir!");
        } // end of if
        else {
            System.out.println(" You didn't guess. ");
        } // end of if-else


    }
}
