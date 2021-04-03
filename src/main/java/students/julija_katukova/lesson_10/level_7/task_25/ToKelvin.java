package students.julija_katukova.lesson_10.level_7.task_25;

class ToKelvin implements Strategy {

    @Override
    public double convertCelsius(double temperatureInCelsius) {
        return temperatureInCelsius + 273.15;
    }

}
