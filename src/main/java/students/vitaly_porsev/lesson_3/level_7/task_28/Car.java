package students.vitaly_porsev.lesson_3.level_7.task_28;

import java.util.Scanner;

class Car {
    String model;
    String color;
    int weight;
    int fuel;

    Car(String model, String color, int weight, int fuel){
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.fuel = fuel;
    }

    void carInfo(){
        System.out.println("Модель: " + this.model + ". Цвет: " + this.color + ". " + "Вес: " + weight
        + ". Количество топлива: " + this.fuel + ".");
    }


    void fillUp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите на сколько нужно заправить автомобиль: ");
        this.fuel += scanner.nextInt();
    }
}
