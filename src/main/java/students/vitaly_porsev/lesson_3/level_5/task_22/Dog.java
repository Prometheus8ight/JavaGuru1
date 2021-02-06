package students.vitaly_porsev.lesson_3.level_5.task_22;

import java.util.Scanner;

public class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println("Кличка: " + this.name + ". Возраст собаки: " + this.age + " лет. "
                + "Окрас собаки: " + this.color + ".");
    }

    void happyBirthday() {
        this.age += 1;
    }

    void changeColor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите окрас собаки: ");
        this.color = scanner.nextLine();
        scanner.close();
        voice();
    }
}
