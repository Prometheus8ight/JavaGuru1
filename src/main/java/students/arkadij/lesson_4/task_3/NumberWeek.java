package students.arkadij.lesson_4.task_3;
import java.util.Scanner;

class NumberWeek {

    public static void main(String[] args) {


        String num1 = "Monday";
        String num2 = "Tuesday";
        String num3 = "Wednesday";
        String num4 = "Thursday";
        String num5 = "Friday";
        String num6 = "Saturday";
        String num7 = "Sunday";

        Scanner wNumber = new Scanner(System.in);
        System.out.println("Please enter any number from 1 to 7 to see what day of the week is now.");
        System.out.println("Enter your number below:");
        int number = wNumber.nextInt();

        if (number == 1){
            System.out.println("You entered: " + number);
            System.out.println("Day of the week is: " + num1);
        } else if (number == 2){
            System.out.println("You entered: " + number);
            System.out.println("Day of the week is: " + num2);
        } else if (number == 3){
            System.out.println("You entered: " + number);
            System.out.println("Day of the week is: " + num3);
        } else if (number == 4){
            System.out.println("You entered: " + number);
            System.out.println("Day of the week is: " + num4);
        } else if (number == 5){
            System.out.println("You entered: " + number);
            System.out.println("Day of the week is: " + num5);
        } else if (number == 6){
            System.out.println("You entered: " + number);
            System.out.println("Day of the week is: " + num6);
        } else if (number == 7){
            System.out.println("You entered: " + number);
            System.out.println("Day of the week is: " + num7);
        } else {
            System.out.println("The number you entered is wrong.");
            System.out.println("Please try again with one number from 1 to 7.");
        }

    }

}
