package students.andrejs_kuramsins.lesson_2.level_0.task_0.lesson_4.task_8;

import java.util.Scanner;

class Task8 {
    public  static void main(String[] args) {

        System.out.println("Please enter your first number :");
        Scanner num1 = new Scanner(System.in);
        int first = num1.nextInt();
        System.out.println("Please enter your second number :");
        Scanner num2 = new Scanner(System.in);
        int second = num2.nextInt();
        System.out.println("Please enter your third number :");
        Scanner num3 = new Scanner(System.in);
        int third = num3.nextInt();
        if (first==second&&second==third) {
            System.out.println("All numbers are equal");
        } else if (first!=second&&second!=third&&third!=first)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");

        }




    }



