package students.pavels_steinbors.lesson_3.level_3.task_12;


class Robot {
    String name;

    Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
