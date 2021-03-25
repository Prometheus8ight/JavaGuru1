package students.julija_katukova.lesson_10.level_4.task_11;

class CelsiusToKelvin implements TemperatureConverter{

    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}
