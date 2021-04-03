package students.alex_kalashnikov.lesson_10.level_4.task_12;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        if (celsiusTemperature >= -273.15) {
            return celsiusTemperature + 273.15;
        } else {
            return 0;
        }
    }

}