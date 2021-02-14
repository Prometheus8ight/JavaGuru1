package students.lolita_polakova.lesson_3.level_5.task_20;

class Dog {

    String name;
    int age;

    Dog (String dogName, int dogAge) {

        this.name = dogName;
        this.age = dogAge;
    }

    public void voice() {
        System.out.println(this.name +  ", age " + this.age);
    }
    public void happyBirthday() {
         this.age++;
        System.out.println("Getting older and wiser!");
    }

}

class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Sol", 2);
        dog.voice();
        dog.happyBirthday();
        dog.voice();
    }



}

