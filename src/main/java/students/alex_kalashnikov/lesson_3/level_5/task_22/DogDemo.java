package students.alex_kalashnikov.lesson_3.level_5.task_22;

class DogDemo {

    public static void main(String[] args) {

        Dog firstDog = new Dog("Шарик","рыжий");
        firstDog.voice();
        firstDog.colour = "зеленый"; // добавил изменение параметра!
        firstDog.changeColour();

    }

}
