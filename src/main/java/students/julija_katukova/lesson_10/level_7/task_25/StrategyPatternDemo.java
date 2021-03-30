package students.julija_katukova.lesson_10.level_7.task_25;

import java.util.Scanner;

class StrategyPatternDemo {

    public static void main(String[] args) {
        System.out.println("Please enter temperature in Celsius: ");
        Scanner scanner = new Scanner(System.in);
        double temperatureInCelsius = scanner.nextDouble();

        Context context = new Context(new ToFahrenheit());
        System.out.println("Temperature in Fahrenheit is " + context.executeStrategy(temperatureInCelsius));

        context = new Context(new ToKelvin());
        System.out.println("Temperature in Kelvin is " + context.executeStrategy(temperatureInCelsius));

        context = new Context(new ToRankine());
        System.out.println("Temperature in Rankine is " + context.executeStrategy(temperatureInCelsius));
    }
}
