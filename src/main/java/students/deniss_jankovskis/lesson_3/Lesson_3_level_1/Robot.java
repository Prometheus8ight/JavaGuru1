package students.deniss_jankovskis.lesson_3.Lesson_3_level_1;

class Robot {

    public void sayHello() {
        System.out.println("Hello!");
    }

    public Robot() {

    }

    void sayYourName() {
        System.out.println("My name is ROBO");


    }

    void howOldAreYou() {
        System.out.println("20");

    }

    void whatDoYouLike() {
        System.out.println("Study JAVA");

    }

    String name;
    Robot(String robotName) {
        this.name = robotName;

    }

    void yourName() {
        System.out.println("My name is " + this.name);
    }






}
