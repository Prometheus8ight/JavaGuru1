package students.rodion_afanasjev.lesson_3.leve_5.task_21;

public class Dog {

    String name;
    String color;
    int age;

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice(){
        System.out.println(name + ", " + age + " years old, i am " + color);
    }

}
