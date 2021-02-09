package students.arkadij.lesson_3.level_5.task_22;

class Dog {

    String name;
    String color;
    String newColor;
    int age;

    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void voice(){
        System.out.println("I am " + name + ", " + age + " years old, and the color of my wool is " + color + ".");
    }

    void changeColor(String newColor){
        this.color = newColor;
        System.out.println("Now i've get a new color of my wool and it is colored in " + newColor + "!");
        System.out.println("So on i am " + name + ", " + age + " years old and from now i am colored to " + newColor + "!");
    }

}
