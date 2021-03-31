package students.vitaly_porsev.lesson_10.level_7.task_28;

class ConverterMethods {

    private TemperatureConverter temperatureConverter;

    public ConverterMethods(TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    double convertFromCelsius(double temperature) {
        return temperatureConverter.convertCelsius(temperature);
    }

    double convertFromFahrenheit(double temperature) {
        return temperatureConverter.convertFahrenheit(temperature);
    }

    double convertFromKelvin(double temperature) {
        return temperatureConverter.convertKelvin(temperature);
    }
}
