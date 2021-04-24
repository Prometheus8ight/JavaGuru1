package students.julija_katukova.lesson_14.level_2;

class AppleRedColorPredicate implements ApplePredicate {

    public boolean test (Apple apple) {
        return apple.getColor().equals("red");
    }

}