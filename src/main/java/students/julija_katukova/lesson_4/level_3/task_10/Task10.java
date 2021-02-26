package students.julija_katukova.lesson_4.level_3.task_10;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Task10 task10 = new Task10();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first integer number:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second integer number:");
        int num2 = scanner.nextInt();
        System.out.println("Please enter third integer number:");
        int num3 = scanner.nextInt();
        // 1,2,3   1,3,2   2,1,3   2,3,1   3,1,2   3,2,1
        System.out.println(task10.max3(num1,num2,num3));
    }
    public int max2(int num1, int num2) {
        if (num1 >= num2) {
            return num1;
        }
        else {
            return num2;
        }
    }
    public int max3 (int num1, int num2, int num3) {
        int max2 = max2(num1, num2);
        if (max2 >= num3) {
            return max2;
        }
        else {
            return num3;
        }
    }
}
