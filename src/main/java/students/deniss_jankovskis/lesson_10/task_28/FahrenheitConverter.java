package students.deniss_jankovskis.lesson_10.task_28;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convertCelsius(double celsiusTemperature) {
        return (celsiusTemperature * 9 / 5) + 32;
    }

    @Override
    public double convertFahrenheit(double fahrenheitTemperature) {
        return fahrenheitTemperature;
    }

    @Override
    public double convertKelvin(double kelvinTemperature) {
        return (kelvinTemperature - 273.15) * 9 / 5 + 32;
    }
}
