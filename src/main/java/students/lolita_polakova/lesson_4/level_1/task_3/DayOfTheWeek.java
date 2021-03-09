package students.lolita_polakova.lesson_4.level_1.task_3;

import java.util.Scanner;

class DayOfTheWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number from 1 to 7: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday!");
            case 6 -> System.out.println("Saturday!");
            case 7 -> System.out.println("Sunday");
        }
    }


}
