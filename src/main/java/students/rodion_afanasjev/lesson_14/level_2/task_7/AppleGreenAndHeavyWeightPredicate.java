package students.rodion_afanasjev.lesson_14.level_2.task_7;

class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150 && apple.getColor().equals("green");
    }
}
