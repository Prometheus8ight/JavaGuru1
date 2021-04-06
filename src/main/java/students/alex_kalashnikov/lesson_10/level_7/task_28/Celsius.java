package students.alex_kalashnikov.lesson_10.level_7.task_28;

class Celsius implements TemperatureConverter {

    @Override
    public double convertToCelsius(double temperature) {
        return temperature;
    }

    @Override
    public double convertToKelvin(double temperature) {
        return temperature + 273.15;
    }

    @Override
    public double convertToFahrenheit(double temperature) {
        return 1.8 * temperature + 32;
    }

}