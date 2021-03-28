package students.vitaly_porsev.lesson_10.level_4.task_12;

class CelsiusConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return (celsiusTemperature * 9 / 5) + 32;
    }

}
