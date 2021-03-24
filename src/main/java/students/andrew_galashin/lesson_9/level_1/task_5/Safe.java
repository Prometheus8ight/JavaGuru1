package main.java.students.andrew_galashin.lesson_9.level_1.task_5;

import java.util.Scanner;

class Safe {

    //Не обратил почему то внимание, на условие задания, но столнкулся при попытке исправить с проблемой,
    //, что сделав Get привата сканер и сложения ломаються, не могу понять ошибся ли я или так сделать попросту невозможно.

    int password;
    double balance = 100;


    void check(int result, int expected) {
        if (result == expected) {
            System.out.println("Your balance: " + balance);
        } else {
            System.out.println("Error!");
        }

    }

    void check2(String result, String expected) {
        Safe safe = new Safe();
        if (result.equals(expected)) {
            safe.putMoney2();
        } else {
            System.out.println("Error");
        }
    }

    void check3(String result, String expected) {
        Safe safe = new Safe();
        if (result.equals(expected)) {
            safe.getMoney2();
        } else {
            System.out.println("Error");
        }
    }

    void putOrGet() {
        Safe safe = new Safe();
        System.out.println("You want to put or take money? PUT/TAKE ...");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String x = "TAKE";
        String y = "PUT";
        if (a.equals(y)) {
            putMoney();
        } else if (a.equals(x)) {
            getMoney();
        } else {
            System.out.println("Error");
        }

    }

    void putMoney() {
        System.out.println("You want to put money?  YES/NO ...");
        Safe safe = new Safe();
        String a = "YES";
        Scanner scanner = new Scanner(System.in);
        String b = scanner.next();
        safe.check2(b, a);
    }

    void putMoney2() {
        Scanner scanner = new Scanner(System.in);
        Safe safe = new Safe();
        System.out.println("How much money you want to put: ");
        int x = scanner.nextInt();
        safe.balance = safe.balance + x;
        System.out.println("Yor balance now is: " + safe.balance);
    }

    void getMoney() {
        System.out.println("You want to take money?  YES/NO ...");
        Safe safe = new Safe();
        String a = "YES";
        Scanner scanner = new Scanner(System.in);
        String b = scanner.next();
        safe.check3(b, a);
    }

    void getMoney2() {
        Scanner scanner = new Scanner(System.in);
        Safe safe = new Safe();
        System.out.println("How much money you want to take: ");
        int x = scanner.nextInt();
        safe.balance = safe.balance - x;
        System.out.println("Yor balance now is: " + safe.balance);
    }

}
