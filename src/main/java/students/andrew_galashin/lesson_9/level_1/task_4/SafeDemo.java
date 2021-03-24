package main.java.students.andrew_galashin.lesson_9.level_1.task_4;

import java.util.Scanner;

class SafeDemo extends Safe {
    public static void main(String[] args) {
        Safe safe = new Safe();
        Scanner scanner = new Scanner(System.in);
        safe.balance1 = 1000.50;
        System.out.println("Enter pincode");
        safe.pinCOde = scanner.nextInt();
        System.out.println("Accept");
        System.out.println("Balance:" + safe.balance1);
    }

}