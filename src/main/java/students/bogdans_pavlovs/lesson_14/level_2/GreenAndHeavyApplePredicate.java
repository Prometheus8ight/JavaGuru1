package students.bogdans_pavlovs.lesson_14.level_2;

class GreenAndHeavyApplePredicate implements ApplePredicate {

    public boolean test (Apple apple) {

        return apple.getWeight() > 150 && apple.getColor().equals("green");
    }

}

