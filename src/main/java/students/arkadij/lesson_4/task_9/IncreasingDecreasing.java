package students.arkadij.lesson_4.task_9;
import java.util.Scanner;

class IncreasingDecreasing {

    public static void main(String[] args) {
        System.out.println("|| INCREASING AND DECREASING ||");

        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = numbers.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = numbers.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = numbers.nextInt();

        if (num1 < num2 && num2 < num3 && num1 < num3){
            System.out.println("Increasing!");
        } else if (num1 > num2 && num2 > num3 && num1 > num3){
            System.out.println("Decreasing!");
        } else {
            System.out.println("Neither increasing or decreasing order!");
        }
    }

}
