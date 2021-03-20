package main.java.students.julija_katukova.lesson_9.level_1.task_4;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        System.out.println("Your pin: " + safe.pin + ". Your balance: " + safe.moneyAmount);
        safe.pin = 1234;
        safe.moneyAmount = 1_000_000;
        System.out.println("Your pin: " + safe.pin + ". Your balance: " + safe.moneyAmount);
        safe.moneyAmount = 0;
        System.out.println("Your pin: " + safe.pin + ". Your balance: " + safe.moneyAmount);
    }

}
