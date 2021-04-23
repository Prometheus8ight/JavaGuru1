package students.rodion_afanasjev.lesson_14.level_2.task_7;

class HeavyApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
