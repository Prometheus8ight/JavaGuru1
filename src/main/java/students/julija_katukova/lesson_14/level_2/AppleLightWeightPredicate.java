package students.julija_katukova.lesson_14.level_2;

class AppleLightWeightPredicate implements ApplePredicate {

    public boolean test (Apple apple) {
        return apple.getWeight() < 150;
    }

}