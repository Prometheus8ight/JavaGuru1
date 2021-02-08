package students.arkadij.lesson_3.level_5.task_21;

public class Dogy {

    String name;
    String color;
    int age;

    public Dogy(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName(){return name;}
    public void voice(){
        System.out.println("Hey, my name is " + name + "!");
        System.out.println("My color is " + color + ".");
        System.out.println("I am " + age + " years old.");
    }

}
