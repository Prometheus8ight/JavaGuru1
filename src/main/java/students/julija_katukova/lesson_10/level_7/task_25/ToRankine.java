package students.julija_katukova.lesson_10.level_7.task_25;

class ToRankine implements Strategy {

    @Override
    public double convertCelsius(double temperatureInCelsius) {
        return (temperatureInCelsius + 273.15) * 1.8;
    }

}
