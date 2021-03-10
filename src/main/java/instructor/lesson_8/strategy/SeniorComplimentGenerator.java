package instructor.lesson_8.strategy;

class SeniorComplimentGenerator extends AbstractComplimentGenerator {

    @Override
    public String next() {
        return "Hey oldie, looking good! Can you hear me?";
    }
}
