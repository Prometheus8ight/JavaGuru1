package students.deniss_jankovskis.lesson_14.level_2;

class AppleYellowColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "yellow".equals(apple.getColor());
    }
}
