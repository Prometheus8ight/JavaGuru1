package students.vitaly_porsev.lesson_10.level_7.task_28;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convertCelsius(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    @Override
    public double convertFahrenheit(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) * 5 / 9 + 273.15;
    }

    @Override
    public double convertKelvin(double kelvinTemperature) {
        return kelvinTemperature;
    }
}
