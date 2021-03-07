package students.darja_scavrovica.lesson_4.level_2.task_7;

import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
      System.out.println("Enter 2 integers number = ");

    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();

        if (number1 == number2) {
        System.out.println("Numbers are equals");}

        else {System.out.println("Numbers are different ");}
}
}
