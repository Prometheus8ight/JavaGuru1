package students.bogdans_pavlovs.lesson_10.level_4.task_11;

public class TemperatureConverterDemo {

    public static void main(String[] args) {

        CelsiusToFahrenheit toFahrenheit = new CelsiusToFahrenheit();

        System.out.println(toFahrenheit.convertTemperature(23.0));

        CelsiusToKelvin toKelvin = new CelsiusToKelvin();

        System.out.println(toKelvin.convertTemperature(23.0));
    }

}
