package students.arkadij.lesson_3.level_3;

class Robot {

    String name;

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void sayYourName(){
        System.out.println("My name is " + name);
    }

    Robot(String robotName){
        name = robotName;
    }

}
