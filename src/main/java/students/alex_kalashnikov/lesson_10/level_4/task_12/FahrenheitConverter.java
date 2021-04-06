package students.alex_kalashnikov.lesson_10.level_4.task_12;

public class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        if (celsiusTemperature >= -273.15) {
            return 1.8 * celsiusTemperature + 32.0;
        } else {
            return 1.8 * -273.15 + 32.0;
        }
    }

}