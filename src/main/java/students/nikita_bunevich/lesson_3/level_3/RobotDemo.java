package students.nikita_bunevich.lesson_3.level_3;

class RobotDemo {
    public static void main(String[] args) {
        Robot bober = new Robot("bober");
        bober.sayHello();
        bober.sayYourName();

        Robot steve = new Robot("steve");
        steve.sayHello();
        steve.sayYourName();
    }
}
