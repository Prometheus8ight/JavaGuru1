package students.julija_katukova.lesson_4.level_1.task_3;

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        System.out.println("Please enter integer number from 1 to 7: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Try again"); // В случае, если введенное число было не от 1 до 7, а, например, 10

        }


    }

}
