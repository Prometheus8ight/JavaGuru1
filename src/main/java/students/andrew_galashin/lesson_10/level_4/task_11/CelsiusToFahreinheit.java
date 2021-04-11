package students.andrew_galashin.lesson_10.level_4.task_11;

class CelsiusToFahreinheit implements TemperatureConverter {
    @Override
    public double convert(double celsius) {
        return (celsius * 1.8) + 32;
    }
}
