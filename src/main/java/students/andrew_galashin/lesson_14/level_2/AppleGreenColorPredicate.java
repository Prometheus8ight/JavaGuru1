package students.andrew_galashin.lesson_14.level_2;

class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
