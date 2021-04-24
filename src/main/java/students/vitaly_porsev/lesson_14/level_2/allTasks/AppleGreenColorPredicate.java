package students.vitaly_porsev.lesson_14.level_2.allTasks;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}
