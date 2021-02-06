package students.rodion_afanasjev.lesson_3.level_7.task_28;

import java.util.Scanner;

class Car {

    String model;
    String color;
    int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void printInfo() {
        System.out.println("Car model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Production date: " + year);
    }

    void changeColor(String newColor){
        System.out.println("Color changed: " + newColor);
    }

}





