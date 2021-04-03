package students.julija_katukova.lesson_10.level_7.task_25;

class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double temperatureInCelsius) {
        return strategy.convertCelsius(temperatureInCelsius);
    }

}
