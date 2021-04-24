package students.vitaly_porsev.lesson_14.level_2.allTasks;

public class AppleGreenAndHeavyWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150 && apple.getColor().equals("green");
    }
}
