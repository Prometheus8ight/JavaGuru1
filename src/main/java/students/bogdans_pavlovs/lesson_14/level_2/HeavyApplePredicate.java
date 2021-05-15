package students.bogdans_pavlovs.lesson_14.level_2;

class HeavyApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
