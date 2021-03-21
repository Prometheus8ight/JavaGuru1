package students.alex_kalashnikov.lesson_9.level_2.task_11;

class Star extends AstronomicalObject {

    protected int temperature;
    protected String classification;

    public Star(long mass, long velocity, int temperature, String classification) {
        super(mass, velocity);
        this.temperature = temperature;
        this.classification = classification;
    }

}