package students.andrew_galashin.lesson_10.level_4.task_11;

public class CelsiusToKelvin implements TemperatureConverter {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}
