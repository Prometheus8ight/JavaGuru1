package students.andrew_galashin.lesson_3.level_5.task_19;


import java.util.Scanner;

class DogDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Dog age " + x);
        Dog dog1 = new Dog();
        dog1.dogName = "Dog Name " + x;
        dog1.voice();


    }
}
