package students.julija_katukova.lesson_10.level_7.task_25;

class ToFahrenheit implements Strategy {

    @Override
    public double convertCelsius(double temperatureInCelsius) {
        return (temperatureInCelsius * 1.8) + 32;
    }

}
