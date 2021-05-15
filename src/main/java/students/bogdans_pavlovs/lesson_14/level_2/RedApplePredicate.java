package students.bogdans_pavlovs.lesson_14.level_2;

class RedApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}


