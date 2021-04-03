package students.julija_katukova.lesson_10.level_7.task_28;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convertCelsius(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }

    @Override
    public double convertFahrenheit(double fahrenheitTemperature) {
        return fahrenheitTemperature;
    }

    @Override
    public double convertKelvin(double kelvinTemperature) {
        return kelvinTemperature * 1.8 - 459.67;
    }
}