package students.arkadij.lesson_3.level_3;

public class RobotDemo {

    public static void main(String[] args) {
        Robot android = new Robot("Android.");
        android.sayHello();
        android.sayYourName();

        Robot harmony = new Robot("Harmony.");
        harmony.sayHello();
        harmony.sayYourName();
    }

}
