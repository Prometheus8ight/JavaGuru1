package students.arkadij.lesson_3.level_5.task_20;

class Dog {

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
        System.out.println("I am " + age + " years old!");
        System.out.println("Oh and my name is " + name + "!");
    }
    void happyBirthday(){
        System.out.println("Happy Birthday " + name + "!");
        age++;
        voice();
    }

}
