package students.rodion_afanasjev.lesson_7.level_5.task_9;

import java.util.Scanner;

class PowerCalculator {

    double calcPower(double number, double power){
        double result = 1;
        double num;
        while (power != 0){
            result *= number;
            --power;
            if (power < 0){
                result *= number;
                ++power;
                num = 1/ result;
                result = num;
                return result;
            }
        }
        return result;
    }

    double input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        double input = scanner.nextDouble();
        return input;
    }

}
