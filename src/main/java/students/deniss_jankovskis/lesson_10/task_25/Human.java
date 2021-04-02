package students.deniss_jankovskis.lesson_10.task_25;

class Human implements Temperature {

    @Override
    public double calculateMyTemperature(double temperature) {
        return (temperature * 1) - 1.7;
    }
}
