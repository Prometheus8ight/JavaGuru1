package students.alex_kalashnikov.lesson_10.level_7.task_28;

class Fahrenheit implements TemperatureConverter {

    @Override
    public double convertToCelsius(double temperature) {
        return (temperature - 32) / 1.8;
    }

    @Override
    public double convertToKelvin(double temperature) {
        return ((temperature - 32.0) / 1.8) + 273.15;
    }

    @Override
    public double convertToFahrenheit(double temperature) {
        return temperature;
    }

}