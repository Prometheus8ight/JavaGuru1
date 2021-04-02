package students.deniss_jankovskis.lesson_10.task_28;

class Methods {

    private TemperatureConverter temperatureConverter;

    public Methods(TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    double convertCelsius(double temperature) {
        return temperatureConverter.convertCelsius(temperature);
    }

    double convertFahrenheit(double temperature) {
        return temperatureConverter.convertFahrenheit(temperature);
    }

    double convertKelvin(double temperature) {
        return temperatureConverter.convertKelvin(temperature);
    }
}
