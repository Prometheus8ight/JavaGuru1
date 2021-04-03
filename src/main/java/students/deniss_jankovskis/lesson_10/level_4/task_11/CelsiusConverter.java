package students.deniss_jankovskis.lesson_10.level_4.task_11;

class CelsiusConverter implements TemperatureConverter {

    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}
