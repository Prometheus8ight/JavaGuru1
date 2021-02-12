package students.julija_katukova.lesson_4.level_3.task_10;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first integer number:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second integer number:");
        int num2 = scanner.nextInt();
        System.out.println("Please enter third integer number:");
        int num3 = scanner.nextInt();
        // 1,2,3   1,3,2   2,1,3   2,3,1   3,1,2   3,2,1

        if (num1 >= num2 && num2 >= num3) {
            System.out.println(num1);
        }
        else if (num1 >= num3 && num3 >= num2) {
            System.out.println(num1);
        }
        else if (num2 >= num1 && num1 >= num3) {
            System.out.println(num2);
        }
        else if (num2 >= num3)  {
            System.out.println(num2);
        }
        else  {
            System.out.println(num3);
        }

    }

}
