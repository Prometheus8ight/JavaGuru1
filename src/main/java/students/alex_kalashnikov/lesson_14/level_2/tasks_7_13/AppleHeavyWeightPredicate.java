package students.alex_kalashnikov.lesson_14.level_2.tasks_7_13;

class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }

}