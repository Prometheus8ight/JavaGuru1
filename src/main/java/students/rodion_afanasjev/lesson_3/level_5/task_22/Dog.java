package students.rodion_afanasjev.lesson_3.level_5.task_22;

public class Dog {

    String name;
    String color;

    Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    void voice(){
        System.out.println(name + " " + color);
    }

    void changeColor(String newColor) {
        System.out.println("Change color: " + newColor);
        System.out.println(name + " " + newColor);

    }
}
