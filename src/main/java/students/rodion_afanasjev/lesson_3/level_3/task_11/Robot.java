package students.rodion_afanasjev.lesson_3.level_3.task_11;

public class Robot {

    String name;

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    Robot(String robotName) {
        this.name = robotName;
    }

}