package students.vitaly_porsev.lesson_3.level_3.tasks;

public class Robot {

    String name;

    public Robot(String name) {
        this.name = name;
    }


    void sayHello(){
        System.out.println("Hello!");
    }

    void sayYourName(){
        System.out.println("My name is " + this.name + "!");

    }

}
