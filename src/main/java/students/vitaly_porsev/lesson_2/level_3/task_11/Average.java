package students.vitaly_porsev.lesson_2.level_3.task_11;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double number = 0;
        double average;
        System.out.println("Введите три числа:");
        while(counter <= 2 ){
            number += scanner.nextDouble();
            counter++;
        }average = number / counter;
        System.out.println("Среднее арифмитическое: " + average);
        scanner.close();
    }
}
