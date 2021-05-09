package students.nikita_bunevich.lesson_14.level_2;


class AppleGreenAndHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green") && apple.getWeight() > 150;
    }
}
