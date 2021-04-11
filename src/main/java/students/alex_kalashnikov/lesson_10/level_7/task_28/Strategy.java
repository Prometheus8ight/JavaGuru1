package students.alex_kalashnikov.lesson_10.level_7.task_28;

class Strategy {

    private TemperatureConverter temperatureConverter;

    public Strategy(TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    double executeConvertToCelsius(double temperature) {
        return temperatureConverter.convertToCelsius(temperature);
    }

    double executeConvertToKelvin(double temperature) {
        return temperatureConverter.convertToKelvin(temperature);
    }

    double executeConvertToFahrenheit(double temperature) {
        return temperatureConverter.convertToFahrenheit(temperature);
    }

}