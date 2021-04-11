package students.bogdans_pavlovs.lesson_10.level_4.task_11;

class CelsiusToKelvin implements TemperatureConverter {

    @Override
    public double convertTemperature(double celsiusDegrees) {
        return celsiusDegrees + 273.15;
    }
}
