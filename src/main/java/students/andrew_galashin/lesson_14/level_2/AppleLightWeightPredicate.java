package students.andrew_galashin.lesson_14.level_2;

class AppleLightWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}
