package students.lolita_polakova.lesson_3.level_5.task_18;

class Dog {

    String name;

    Dog(String dogName) {
        this.name = dogName;
        }
    public void voice() {
        System.out.println(this.name +  ", " + this.name + ", " + this.name + "!");
    }

}

class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Sol");
        dog.voice();
    }


}