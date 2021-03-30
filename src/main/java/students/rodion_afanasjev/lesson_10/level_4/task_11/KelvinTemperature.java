package students.rodion_afanasjev.lesson_10.level_4.task_11;

class KelvinTemperature implements TemperatureConverter {

    @Override
    public double tempConvert(double temperature) {
        return temperature + 273.15;
    }

}
