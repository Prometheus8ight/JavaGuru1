package students.kirils_odnobokovs.lesson_2.level_3.task_9;

import java.sql.SQLOutput;

public class Task_9 {

    public static void main(String[] args) {

        // Более быстрый вариант, ну или как в лекции в 10 строчек. Если надо допишу

        System.out.println("Test Data");
        System.out.println("Input a number");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numInput = scanner.nextInt();

        int number;
        for(number = 1; number <= 10; number = number + 1){

            System.out.println(number + "*" + numInput + "=" + number * numInput);
        }


    }
}
