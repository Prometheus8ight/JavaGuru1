package students.andrew_galashin.lesson_14.level_2;

public class AppleRedColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}
