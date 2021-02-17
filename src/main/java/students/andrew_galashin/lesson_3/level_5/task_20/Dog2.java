package students.andrew_galashin.lesson_3.level_5.task_20;

import java.util.Scanner;
class Dog2 {
    public static void main(String[] args) {
        System.out.println("Enter Dog age before birthday: ");
        Scanner scanner =  new Scanner(System.in);
        int x = scanner.nextInt() + 1;
        System.out.println("Dogs age = " + x);
        Dog dog1 = new Dog ("Dog Name " + x);

        dog1.voice();
        dog1.happyBirthday();
        dog1.voice();
    }
}

