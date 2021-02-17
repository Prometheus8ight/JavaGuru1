package students.lolita_polakova.lesson_3.level_5.task_21;

class Dog {

    String name;
    String color;
    int age;

    Dog(String dogName, String dogColor, int dogAge) {

        this.name = dogName;
        this.color = dogColor;
        this.age = dogAge;
    }

    public void voice() {
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Age: " + this.age);
    }
}
class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Sol", "white", 2);
        dog.voice();
    }
}
