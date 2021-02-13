package students.lolita_polakova.lesson_3.level_5.task_22;

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
        System.out.println(this.name + ", age " + this.age + ", " + this.color + " color");
    }

    void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("New makeover, feeling rad!");
    }
}
class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Sol", "white", 2);
        dog.voice();
        dog.changeColor("pink");
        dog.voice();
    }
}

