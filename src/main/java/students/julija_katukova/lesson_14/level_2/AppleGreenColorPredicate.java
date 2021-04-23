package students.julija_katukova.lesson_14.level_2;

class AppleGreenColorPredicate implements ApplePredicate {

    public boolean test (Apple apple) {
        return apple.getColor().equals("green");
    }

}