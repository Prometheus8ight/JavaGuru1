package students.nikita_bunevich.lesson_14.level_2;


class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple)
    { return apple.getWeight() > 150; }
}
