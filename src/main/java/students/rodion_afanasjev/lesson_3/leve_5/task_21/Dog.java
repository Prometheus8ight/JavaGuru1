package students.rodion_afanasjev.lesson_3.leve_5.task_21;

public class Dog {

    String color;
    int age;

    public Dog(int age, String color){
        this.age = age;
        this.color = color;
    }

    public void voice(){
        System.out.println("Barsik, " + age + " years old, i am " + color);
    }

}
