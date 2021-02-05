package students.rodion_afanasjev.lesson_3.leve_5.task_20;

public class Dog {

    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void voice(){
        System.out.println("My name is " + name + " i am " + age + " years old!");
    }

    void happyBirthday(){
        System.out.println("Happy Birthday " + name + " !");
        age++;
        voice();
    }
}
