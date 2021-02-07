package students.bogdans_pavlovs.lesson_3.level_5.task_22;

class DogDemo {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Jacky";
        dog1.age = 3;
        dog1.color = "White";

        dog1.voice();

        dog1.changeColor("Brown");

        dog1.voice();

    }

}
