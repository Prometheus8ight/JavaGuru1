package students.rodion_afanasjev.lesson_10.level_4.task_11;

class FahrenheitTemperature implements TemperatureConverter {

    @Override
    public double tempConvert(double temperature) {
        return 1.8 * temperature + 32;
    }

}
