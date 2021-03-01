package students.andrew_galashin.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                System.out.println("Enter first number: ");
                int x = scanner.nextInt();
                    System.out.println("Enter second number: ");
                    int y = scanner.nextInt();
                        System.out.println("Enter third number: ");
                        int a = scanner.nextInt();

                            int[] massive = new int [3];
                            massive[0] = x;
                            massive[1] = y;
                            massive[2] = a;

        System.out.println(massive[0]);
        System.out.println(massive[1]);
        System.out.println(massive[2]);


    }
}
