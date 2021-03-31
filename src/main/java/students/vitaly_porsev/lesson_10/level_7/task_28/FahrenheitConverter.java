package students.vitaly_porsev.lesson_10.level_7.task_28;

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
        return (kelvinTemperature - 273.15) * 9/5 + 32;
    }
}