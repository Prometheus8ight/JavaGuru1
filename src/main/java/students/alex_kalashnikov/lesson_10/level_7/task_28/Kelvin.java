package students.alex_kalashnikov.lesson_10.level_7.task_28;

class Kelvin implements TemperatureConverter {

    @Override
    public double convertToCelsius(double temperature) {
        return temperature - 273.15;
    }

    @Override
    public double convertToKelvin(double temperature) {
        return temperature;
    }

    @Override
    public double convertToFahrenheit(double temperature) {
        return (temperature - 273.15) * 1.8 + 32;
    }

}