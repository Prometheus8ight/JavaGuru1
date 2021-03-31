package students.julija_katukova.lesson_10.level_7.task_28;

class Context {

    private final TemperatureConverter strategy;

    public Context(TemperatureConverter strategy) {
        this.strategy = strategy;
    }

    public double convertCelsius(double celsiusTemperature) {
        return strategy.convertCelsius(celsiusTemperature);
    }

    public double convertFahrenheit(double fahrenheitTemperature) {
        return strategy.convertFahrenheit(fahrenheitTemperature);
    }

    public double convertKelvin(double kelvinTemperature) {
        return strategy.convertKelvin(kelvinTemperature);
    }

}