package students.bogdans_pavlovs.lesson_10.level_4.task_11;

class CelsiusToFahrenheit implements TemperatureConverter {

    @Override
    public double convertTemperature(double celsiusDegrees) {
        return celsiusDegrees * 1.85 + 32;
    }
}
