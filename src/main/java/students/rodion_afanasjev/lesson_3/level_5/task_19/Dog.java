package students.rodion_afanasjev.lesson_3.level_5.task_19;

public class Dog {

    String name;
    String age;

    public Dog(String name, String age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void voice(){
        System.out.println(name);
        System.out.println(age);
    }

}
