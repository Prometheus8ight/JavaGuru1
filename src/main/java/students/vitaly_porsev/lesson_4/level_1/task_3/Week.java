package students.vitaly_porsev.lesson_4.level_1.task_3;

import java.util.Scanner;

public class Week {

    void whatDayIsIt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;

            case 2:
                System.out.println("Вторник");
                break;

            case 3:
                System.out.println("Среда");
                break;

            case 4:
                System.out.println("Четверг");
                break;

            case 5:
                System.out.println("Пятница");
                break;

            case 6:
                System.out.println("Суббота");
                break;

            case 7:
                System.out.println("Воскресенье");

            default:
                System.out.println("Вы ввели неправильннное число, попробуйте от 1 до 7.");
                System.out.println();
                whatDayIsIt();
        }
    }

}
