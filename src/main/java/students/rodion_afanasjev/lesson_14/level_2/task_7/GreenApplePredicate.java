package students.rodion_afanasjev.lesson_14.level_2.task_7;

class GreenApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}
